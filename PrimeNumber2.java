import java.util.*;
public class PrimeNumber2
{
    static boolean isPrime(int x)
    {
        for(int i = 2; i < x/2; i++)
        {
            if(x%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = x.nextInt();
        System.out.println(isPrime(n));
    }
}
