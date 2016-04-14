package banking;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by a609848 on 12/04/2016.
 */
public class Bank {

    private Map<Integer, Account> accounts = new HashMap<>();

    public Bank(List<Account> accountList){
        accountList.stream().forEach(a -> accounts.put(a.getId(), a));
    }

    public double deposit(int id , double amount){
        return accounts.get(id).deposit(new BigDecimal(amount+""));
    }

    public double withdraw(int id , double amount){
        return accounts.get(id).withdraw(new BigDecimal(amount+""));
    }

    public double getBalance(int id ){
        return accounts.get(id).getBalance();
    }
}
