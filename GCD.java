public class GCD
{
    static int gcd(int x, int y)
    {
        while (x != y)
        {
            if(x>y)
                x=x-y;
            else
                y=y-x;
        }
        return x;
    }
    public static void main(String[] h)
    {
        int n = 15;
        int m = 10;
        int gcd = gcd(m,n);
        System.out.println(gcd);
    }
}
