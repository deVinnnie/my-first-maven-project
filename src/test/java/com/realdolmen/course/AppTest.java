package com.realdolmen.course;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        Assert.assertTrue( true );
    }

    @Test
    public void testThatIIsMultipliedByFive(){
        Assert.assertEquals(25,new App(5).getI());

    }
}
