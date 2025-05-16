import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @DisplayName("Факториал числа")
    @Test
    void testFactorial() {
        assertEquals(24, Factorial.execute(4));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, Factorial.execute(0));
    }

    @Test
    void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.execute(-3));
    }
}