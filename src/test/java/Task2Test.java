import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void transition2x3Test() throws Exception {
        int[][] source = {{1, 3, 5}, {2, 4, 6}};
        int[][] expected = {{2,1}, {4,3}, {6,5}};
        assertArrayEquals(expected, Task2.transition(source));
    }

    @Test
    public void transition1x3Test() throws Exception {
        int[][] source = {{1, 3, 5}};
        int[][] expected = {{1}, {3}, {5}};
        assertArrayEquals(expected, Task2.transition(source));
    }

    @Test
    public void transition1x1Test() throws Exception {
        int[][] source = {{1}};
        int[][] expected = {{1}};
        assertArrayEquals(expected, Task2.transition(source));
    }

    @Test
    public void transition3x1Test() throws Exception {
        int[][] source = {{1}, {3}, {5}};
        int[][] expected = {{5, 3, 1}};
        assertArrayEquals(expected, Task2.transition(source));
    }

    @Test
    public void transition2x2Test() throws Exception {
        int[][] source = {{1, 3}, {2, 4}};
        int[][] expected = {{2,1}, {4,3}};
        assertArrayEquals(expected, Task2.transition(source));
    }

    @Test(expected = Exception.class)
    public void transition0x0Test() throws Exception {
        int[][] source = {{}};
        Task2.transition(source);
    }

    @Test(expected = Exception.class)
    public void transitionNullTest() throws Exception {
        Task2.transition(null);
    }
}