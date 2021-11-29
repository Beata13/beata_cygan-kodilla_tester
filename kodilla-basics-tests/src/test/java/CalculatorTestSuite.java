import com.kodilla.bassic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 2;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(8, subtractResult);
    }

    @Test
    public void testRaising() {
        Calculator calculator = new Calculator();
        double a = -2;
       int raisingResult = calculator.raising(a);

        assertEquals(5, raisingResult, 1);

    }
}
