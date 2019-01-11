package com.stackroute.PE4testcases;

import com.stackroute.PE4.OccuranceOfString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class OccuranceOfStringTest {
    OccuranceOfString occuranceOfString;
    @Before
    public void setUp()
    {
        occuranceOfString =new OccuranceOfString();
    }
    @After
    public void tearDown()
    {
        occuranceOfString =null;
    }

    @Test
    public void testOccuranceOfStringSuccess()
    {
        String actualValue=occuranceOfString.findOcuuranceOfString("She sells seashells by the seashore","se");
        String expectedValue="Found at: 4 - 6 "+"Found at: 10 - 12 "+"Found at: 27 - 29";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testOccuranceOfStringFailure()
    {

        String actualValue=occuranceOfString.findOcuuranceOfString("She sells seashells by the seashore","se");
        String expectedValue="Found at: 4 - 6 "+"Found at: 10 - 12 "+"Found at: 26 - 29";
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testOccuranceOfStringNeutral()
    {

        String actualValue=occuranceOfString.findOcuuranceOfString("","se");
        String expectedValue="Check String is not there!";
        assertNotNull(expectedValue,actualValue);

        actualValue=occuranceOfString.findOcuuranceOfString(null,"se");
        assertNull(actualValue);

    }


}