package javabasedconfiguration;

import day2.pojo.AccountRepository;
import day2.pojo.AccountRepositoryIml;
import day2.pojo.AccountService;
import day2.pojo.AccountServiceIml;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCofiguration {
    @Bean
    public AccountService accountService(){
        AccountServiceIml bean = new AccountServiceIml();
        bean.setAccountRepository(accountDao());
        return bean;
    }
    @Bean
    public AccountRepository accountDao(){
        AccountRepositoryIml bean = new AccountRepositoryIml();
        return bean;
    }

}
