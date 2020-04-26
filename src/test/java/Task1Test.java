import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void calcSummTest() throws Exception {
        assertEquals(4613732, Task1.calcSumm());
    }

    @Test
    public void sumOfEvenNumbersWithMaxValueIs2Test() throws Exception {
        assertEquals(2, Task1.sumOfEvenNumbers(2));
    }

    @Test
    public void sumOfEvenNumbersWithMaxValueIs12Test() throws Exception {
        assertEquals(10, Task1.sumOfEvenNumbers(12));
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test(expected = Exception.class)
    public void sumOfEvenNumbersWithMaxValueIs1Test() throws Exception {
        Task1.sumOfEvenNumbers(1);
    }
}