
/**
 * class Fibonacci provides two variations on methods 
 * to calculate the nth Fibonacci number
 * 
 * @author (PM Davies) 
 * @version (2018-09-26)
 */
public class Fibonacci
{
    public static int fibR(int n)
    {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibR(n-1) + fibR (n - 2);

    }

    public static long fibI(int n)
    {
        long f1 = 1, f2 = 1;
        while (n > 2)
        {
            long next = f1 + f2;
            f1 = f2;
            f2 = next;
            n--;
        }
        return f2;
    }
            
}
