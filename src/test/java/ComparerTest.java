import org.example.Comparer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparerTest {

    @DisplayName("Сравненние чисел")
    @Test
    void testCompare(){
        Assertions.assertEquals(-1, Comparer.compare(1,10));
        Assertions.assertEquals(-0, Comparer.compare(1,1));
        Assertions.assertEquals(1, Comparer.compare(12,10));
    }
}
