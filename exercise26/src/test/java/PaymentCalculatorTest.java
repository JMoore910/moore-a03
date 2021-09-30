import baseline.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    public void test_calculator(){
        PaymentCalculator calc = new PaymentCalculator(.0001,1000, 100);
        double expected,actual;
        expected = (-1.0 / 30.0) * (log10(1.0 + 1000 / 100 * (1.0 - pow(1.0 + .0001, 30))) / log10(1.0 + .0001));
        actual = calc.calculateMonthsUntilPaidOff();
        assertEquals(expected,actual,0.000001);
    }
}