package kss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple BlackBox Testing App.
 */
public class BboxTesting 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void noFalse()
    {
        assertEquals(-5, Bbox.sin(2, true, true, true));
    }
    @Test
    public void negateFalse()
    {
        assertEquals(26, Bbox.sin(5, true, true, false));
    }
    @Test
    public void incrementFalse()
    {
        assertEquals(-101, Bbox.sin(10, true, false, true));
    }
    @Test 
    public void squareFalse()
    {
        assertEquals(-401, Bbox.sin(20, false, true, true));
    }
}
