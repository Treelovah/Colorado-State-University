package kss;

/**
 * BlackBox Testing
 *
 */
public class App
{
    public static int sin(int x, boolean square, boolean increment, boolean negate)
    {
        if (square || increment || negate)
        {
            x *= x;
            if (increment || negate)
            {
                x++;
                if (negate)
                {
                    x = -x;
                }
            }
        }
        return x;
    }
}
