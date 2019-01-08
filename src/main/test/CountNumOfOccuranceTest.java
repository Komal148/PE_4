import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountNumOfOccuranceTest {

    CountNumOfOccurance countNumOfOccurance;
    @Before
    public void setUp()
    {
        countNumOfOccurance=new CountNumOfOccurance();
    }
    @After
    public void tearDown()
    {
        countNumOfOccurance=null;
    }

    @Test
    public void testCountNumOccuranceSuccess()
    {
        String originalString="Java is java again java again";
        int actualValue=countNumOfOccurance.countNumOccurance(originalString,'a');
        int expectedValue=10;
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testCountNumOccuranceFailure()
    {
        String originalString="Java is java again java again";
        int actualValue=countNumOfOccurance.countNumOccurance(originalString,'a');
        int expectedValue=12;
        assertNotEquals(expectedValue,actualValue);

    }

    @Test
    public void testCountNumOccuranceNeutral()
    {
        String originalString="";
        int actualValue=countNumOfOccurance.countNumOccurance(originalString,'a');
        assertNotNull(actualValue);

        originalString=null;
        actualValue=countNumOfOccurance.countNumOccurance(originalString,'a');
        int expectedValue=0;
        assertEquals(expectedValue,actualValue);
    }

}