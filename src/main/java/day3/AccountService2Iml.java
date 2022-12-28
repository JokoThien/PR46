package day3;

import day2.pojo.Account;
import day2.pojo.AccountRepository;
import day2.pojo.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("accountService")
public class AccountService2Iml implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {
        Account sourceAccount = accountRepository.find(fromAccountId);
        Account targetAccount = accountRepository.find(toAccountId);
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        targetAccount.setBalance(sourceAccount.getBalance() + amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(targetAccount);
    }

    @Override
    public void deposiMoney(long accountId, double amount) throws Exception {


    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find( accountId);
    }
}
