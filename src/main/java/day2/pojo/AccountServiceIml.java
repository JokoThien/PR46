package day2.pojo;

public class AccountServiceIml implements AccountService{
    private AccountRepository accountRepository;
    public void setAccountRepository(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    };
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
