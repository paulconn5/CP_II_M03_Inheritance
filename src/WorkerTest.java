import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1;

    @BeforeEach
    void setUp() {
         w1 = new Worker("Mark","Marx", "000001", "Mr.", 1990, 50);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(2000, w1.calculateWeeklyPay(40));
    }
}