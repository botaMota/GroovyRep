package banking

import groovy.transform.Canonical

/**
 * Created by a609848 on 12/04/2016.
 */
@Canonical
class GroovyAccount implements Account {

    Integer id
    BigDecimal balance

    @Override
    double deposit(BigDecimal amount) {
        balance +=amount
    }

    @Override
    double withdraw(BigDecimal amount) {
        deposit(-amount)
    }

    @Override
    double getBalance() {
        balance
    }
}
