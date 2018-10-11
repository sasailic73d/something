import money.Money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SomethingTest {

    @Test
    public void constructorShouldSetAmountAndCurrency() {
        Money money = new Money(10, "USD");

        assertEquals(10, money.getAmount());
    }

}