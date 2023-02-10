import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw;

    @BeforeEach
    void setUp() {
        sw = new SalaryWorker("Joe", "Birch", "123456", "Mr.", 1990, 45, 85000);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1634.6153846153845, sw.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Mr. Joe Birch\nWeekly pay is $1634.6153846153845\n", sw.displayWeeklyPay(40));

    }
}