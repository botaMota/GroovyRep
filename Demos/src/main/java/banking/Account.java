package banking;

import java.math.BigDecimal;

/**
 * Created by a609848 on 12/04/2016.
 */
public interface Account {

    double deposit(BigDecimal amount);
    double withdraw(BigDecimal amount);
    double getBalance();
    Integer getId();
}
