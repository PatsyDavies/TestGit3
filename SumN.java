
/**
 * class sumN provides two versions of the sum method
 * 
 * @author (PM Davies) 
 * @version (2018-09-26)
 */
public class SumN
{
    public static int recurSum(int n)
    {
        if (n == 1)
            return 1;
        else
        {
            return n+ recurSum(n-1);
        }
    }

    public static int iterSum(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum+=i;
        return sum;

    }
}
