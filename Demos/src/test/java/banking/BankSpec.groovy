package banking

import spock.lang.Specification

/**
 * Created by a609848 on 12/04/2016.
 */
class BankSpec extends Specification{

    Bank groovyBank

    void setup(){
        groovyBank = new Bank([new GroovyAccount(1, 100.0), new GroovyAccount(2, 100.0)])
    }

    def "deposit 50 to account 1 adds 50"(){
        when:
        groovyBank.deposit(1, 50.0)

        then:
        groovyBank.getBalance(1) == old(groovyBank.getBalance(1))+ 50
    }

    def "withdraw 50 to account 2"(){
        when:
        groovyBank.withdraw(2,50.0)

        then:
        groovyBank.getBalance(2) == old(groovyBank.getBalance(2)) - 50

    }
}
