package kss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple BlackBox Testing App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void noFalse()
    {
        assertEquals(-5, App.sin(2, true, true, true));
    }
    @Test
    public void negateFalse()
    {
        assertEquals(26, App.sin(5, true, true, false));
    }
    @Test
    public void incrementFalse()
    {
        assertEquals(-101, App.sin(10, true, false, true));
    }
    @Test 
    public void squareFalse()
    {
        assertEquals(-401, App.sin(20, false, true, true));
    }
}
