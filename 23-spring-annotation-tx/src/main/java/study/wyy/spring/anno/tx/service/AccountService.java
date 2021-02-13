package study.wyy.spring.anno.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import study.wyy.spring.anno.tx.dao.AccountDao;
import study.wyy.spring.anno.tx.event.AccountApplicationEvent;
import study.wyy.spring.anno.tx.pojo.Account;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/13 7:39 下午
 */
@Component
public class AccountService {

    @Autowired
    AccountDao accountDao;

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;


    /*** 转账
     * @param sourceName 转出账户名称
     * @param targetName 转入账户名称
     * @param money 转账金额
     * */
    @Transactional(transactionManager = "platformTransactionManager")
    public void transfer(String sourceName,String targetName,Integer money){
        try {
            //1.根据名称查询转出账户
            Account source = accountDao.findByName(sourceName);
            //2.根据名称查询转入账户
            Account target = accountDao.findByName(targetName);
            //3.转出账户减钱
            source.setMoney(source.getMoney() - money);
            //4.转入账户加钱
            target.setMoney(target.getMoney() + money);
            //5.更新转出账户
            accountDao.update(source);
            //模拟转账异常
            int i=1/0;
            //6.更新转入账户
            accountDao.update(target);
        }finally {
            // 发布事件
            Map<String,String> map= new HashMap<>();
            map.put("source",sourceName);
            map.put("target",targetName);
            AccountApplicationEvent event = new AccountApplicationEvent(map);
            applicationEventPublisher.publishEvent(event);
        }

    }
}
