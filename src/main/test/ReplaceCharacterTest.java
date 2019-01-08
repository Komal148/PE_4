import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class ReplaceCharacterTest {

    ReplaceCharacter replaceCharacter;
    @Before
    public void setUp()
    {
        replaceCharacter = new ReplaceCharacter();
    }
    @After
    public void tearDown()
    {
        replaceCharacter=null;
    }

    @Test
    public void testReplaceCharacterSuccess()
    {
        String actualValue=replaceCharacter.replaceCharcterMethod('d','f','l','t',"daily dry");
        String expectedValue="faity fry";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testReplaceCharacterFailure()
    {
        String actualValue=replaceCharacter.replaceCharcterMethod('d','f','l','t',"daily dry");
        String expectedValue="faity dry";
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testReplaceCharacterNeutral()
    {

        String actualValue=replaceCharacter.replaceCharcterMethod('d','f','l','t',"");
        assertNotNull(actualValue);

        actualValue=replaceCharacter.replaceCharcterMethod('d','f','l','t',null );
        assertNull(actualValue);
    }


}