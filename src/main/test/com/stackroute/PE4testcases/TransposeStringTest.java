package com.stackroute.PE4testcases;

import com.stackroute.PE4.TransposeString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TransposeStringTest {

    TransposeString transposeString;
    @Before
    public void setUp()
    {
        transposeString=new TransposeString();
    }
    @After
    public void tearDown()
    {
        transposeString=null;
    }

    @Test
    public void testTransposeStringSuccess()
    {
        String originalString="a quick brown fox jumps over the lazy dog";
        String actualValue=transposeString.reverseStringMethod(originalString);
        String expectedValue="a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testTransposeStringFailure()
    {
        String originalString="a quick brown fox jumps over the lazy dog";
        String actualValue=transposeString.reverseStringMethod(originalString);
        String expectedValue="a kciuq nworb xof jumps revo eht yzal god";
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testTransposeStringNeutral()
    {
        String actualValue="";
        String expectedValue=null;
        assertNotNull(expectedValue,actualValue);

        actualValue=null;
        expectedValue=null;
        assertNull(expectedValue,actualValue);
    }


}