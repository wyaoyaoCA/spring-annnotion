package study.wyy.spring.anno.tx.event;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import java.util.Map;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/13 8:37 下午
 */
@Component
public class AccountApplicationEventListener {


    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void afterCommit(AccountApplicationEvent event){
        Map<String,String> map  = (Map<String, String>) event.getSource();
        System.out.println("事务提交后执行：" + map);
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void afterRollback(AccountApplicationEvent event){
        Map<String,String> map  = (Map<String, String>) event.getSource();
        System.out.println("事务回滚后执行：" + map);
    }
}
