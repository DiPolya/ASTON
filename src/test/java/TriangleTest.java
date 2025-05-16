import org.example.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {

    @Test
    void testAreaNormal(){
        assertEquals(15.0, Triangle.areaTriangle(6,5));
    }

    @Test
    void testAreaZero(){
        assertEquals(0.0, Triangle.areaTriangle(0,5));
    }

    @Test
    void testAreaNegative(){
        assertThrows(IllegalArgumentException.class, () -> Triangle.areaTriangle(-2,10));
    }
}
