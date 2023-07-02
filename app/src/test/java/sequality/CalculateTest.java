package sequality;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {
    @Test

    public void testSum(){
        Calculate calculate = new Calculate();
        int expected = 6;
        assertEquals(expected,calculate.sum(2,3));
    }
}