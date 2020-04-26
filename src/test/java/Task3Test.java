import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void calculateScoreSimple1Test() throws Exception {
        String str = "a";
        Task3.Template[] templateArray = new Task3.Template[1];
        templateArray[0] = new Task3.Template("aa", 1, 2);
        assertEquals(0, Task3.calculateScore(str, templateArray));
    }

    @Test
    public void calculateScoreSimple2Test() throws Exception {
        String str = "aa";
        Task3.Template[] templateArray = new Task3.Template[1];
        templateArray[0] = new Task3.Template("a", 1, 2);
        assertEquals(4, Task3.calculateScore(str, templateArray));
    }

    @Test
    public void calculateScoreSimple3Test() throws Exception {
        String str = "aa";
        Task3.Template[] templateArray = new Task3.Template[1];
        templateArray[0] = new Task3.Template("aa", 1, 2);
        assertEquals(2, Task3.calculateScore(str, templateArray));
    }

    @Test
    public void calculateScoreNestedTemplateTest() throws Exception {
        String str = "abbaabba";
        Task3.Template[] templateArray = new Task3.Template[2];
        templateArray[0] = new Task3.Template("aa", 1, 2);
        templateArray[1] = new Task3.Template("bbbb", 2, 31);
        assertEquals(35, Task3.calculateScore(str, templateArray));
    }

    @Test
    public void calculateScoreTest() throws Exception {
        String str = "abbaabbaerereaar";
        Task3.Template[] templateArray = new Task3.Template[3];
        templateArray[0] = new Task3.Template("aa", 1, 2);
        templateArray[1] = new Task3.Template("bbbb", 2, 31);
        templateArray[2] = new Task3.Template("ererer", 3, 5);
        assertEquals(42, Task3.calculateScore(str, templateArray));
    }

    @Test(expected = Exception.class)
    public void calculateScoreEmptyStringTest() throws Exception {
        Task3.Template[] templateArray = new Task3.Template[1];
        templateArray[0] = new Task3.Template("aa", 1, 2);
        Task3.calculateScore("", templateArray);
    }

    @Test(expected = Exception.class)
    public void calculateScoreNullStringTest() throws Exception {
        Task3.Template[] templateArray = new Task3.Template[1];
        templateArray[0] = new Task3.Template("aa", 1, 2);
        Task3.calculateScore(null, templateArray);
    }

    @Test(expected = Exception.class)
    public void calculateScoreNullTemplatesTest() throws Exception {
        Task3.calculateScore("aa", null);
    }

    @Test(expected = Exception.class)
    public void calculateScoreEmptyTemplatesTest() throws Exception {
        Task3.Template[] templateArray = new Task3.Template[1];
        Task3.calculateScore("aa", templateArray);
    }

    @Test(expected = Exception.class)
    public void calculateScoreEmptyTemplateStringTest() throws Exception {
        Task3.Template[] templateArray = new Task3.Template[1];
        templateArray[0] = new Task3.Template("", 1, 2);
        Task3.calculateScore("aa", templateArray);
    }
    @Test(expected = Exception.class)
    public void calculateScoreZeroLengthTemplatesTest() throws Exception {
        Task3.Template[] templateArray = new Task3.Template[0];
        Task3.calculateScore("aa", templateArray);
    }

}