
/**
 * class RecurMethods provides two examples of recursive methods
 * 
 * @author (PM Davies) 
 * @version (2018-09-26)
 */
public class RecurMethods
{
    public static void starPlay(int n)
    {
        if (n == 0)
            System.out.println("Bye for now!");
        else
        {
            for (int i = 1; i <= n; i++)
                System.out.print("*");
            System.out.println();
            starPlay(n-1);
        }
    }

    public static void catastrophe(int n)
    {
        System.out.println("printing");
        catastrophe(n);
    }
}
