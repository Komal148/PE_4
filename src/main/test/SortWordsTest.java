import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class SortWordsTest {

    SortWords sortWords=new SortWords();
    @Before
    public void setUp()
    {
        sortWords=new SortWords();
    }
    @After
    public void tearDown()
    {
        sortWords=null;
    }

    @Test
    public void testSortWordsSuccess()
    {
        String originalString="Hey This is me";
        String actualValue=sortWords.wordSortingMethod(originalString);
        String expectedValue="eHy hisT is em";
        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void testSortWordsFailure()
    {

        String originalString="Hey This is me";
        String actualValue=sortWords.wordSortingMethod(originalString);
        String expectedValue="eHy hisT is me";
        assertNotEquals(expectedValue,actualValue);

    }

    @Test
    public void testSortWordsNeutral()
    {

        String originalString=null;
        String actualValue=sortWords.wordSortingMethod(originalString);
        String expectedValue=null;
        assertEquals(expectedValue,actualValue);


        originalString="";
        actualValue=sortWords.wordSortingMethod(originalString);
        assertNotNull(actualValue);

    }


}