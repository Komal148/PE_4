package com.stackroute.PE4testcases;

import com.stackroute.PE4.PresenceOfHarry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class PresenceOfHarryTest {

    PresenceOfHarry presenceOfHarry;

    @Before
    public void setUp()
    {
        presenceOfHarry=new PresenceOfHarry();
    }
    @After
    public void tearDown()
    {
        presenceOfHarry=null;
    }

    @Test
    public void testPresenceOfHarrySuccess()
    {
        String actualValue=presenceOfHarry.checkHarry("This is Harry.");
        String expectedValue="Is Harry here ? true";
        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void testPresenceOfHarryFailure()
    {
        String actualValue=presenceOfHarry.checkHarry("This is Henry.");
        String expectedValue="Is Harry here ? false";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testPresenceOfHarryNeutral()
    {

        String actualValue=presenceOfHarry.checkHarry("");
        assertNotNull(actualValue);

        actualValue=presenceOfHarry.checkHarry(null);
        assertNull(actualValue);
    }

}