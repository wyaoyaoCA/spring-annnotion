package study.wyy.spring.anno.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import study.wyy.spring.anno.tx.pojo.Account;

import java.util.List;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2021/2/13 7:41 下午
 */
@Repository
public class AccountDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Account findByName(String name){
        List<Account> accounts = jdbcTemplate.query("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class), name);
        if(accounts == null || accounts.isEmpty()){
            return null;
        }
        return accounts.get(0);
    }

    public void update(Account account) {
        jdbcTemplate.update("update account set name=?,money=? where id =?",account.getName(),account.getMoney(),account.getId());
    }

}
