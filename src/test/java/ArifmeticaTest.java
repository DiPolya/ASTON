import org.example.Arifmetica;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArifmeticaTest {

    @Test
    void testAddition() {
        assertEquals(14, Arifmetica.add(11, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(20, Arifmetica.subtract(25, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(56, Arifmetica.multiply(7, 8));
    }

    @Test
    void testDivision() {
        assertEquals(4, Arifmetica.divide(100, 25));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Arifmetica.divide(9, 0));
    }
}
