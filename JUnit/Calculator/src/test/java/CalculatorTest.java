// CalculatorTest.java
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator() ;

    @Test
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(-2, calculator.add(-5, 3));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-8, calculator.subtract(-5, 3));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-15, calculator.multiply(-5, 3));
        assertEquals(0, calculator.multiply(0, 100));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-6, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Cannot divide by zero!", exception.getMessage());
    }
}
