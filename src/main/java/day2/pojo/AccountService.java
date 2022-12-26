package day2.pojo;

public interface AccountService {
    void transferMoney(long fromAccountId, long toAccountId, double amount);
    void deposiMoney(long accountId, double amount) throws Exception;
    Account getAccount(long accountId);
}
