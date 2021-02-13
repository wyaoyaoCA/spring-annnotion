package study.wyy.spring.anno.tx.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import study.wyy.spring.anno.tx.config.SpringConfig;
import study.wyy.spring.anno.tx.service.AccountService;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/13 8:04 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TxTest {

    @Autowired
    AccountService accountService;


    @Test
    public void test(){
        accountService.transfer("kobe","wade",100);
    }
}
