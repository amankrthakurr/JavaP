import java.util.*;
public class PrimeNumber
{
    static void isPrime(int x)
    {
        for(int i = 2; i < x; i++)
        {
            if(x%i == 0)
            {
                System.out.println("Not a Prime Number...");
                break;
            }
            System.out.println("Prime Number");
            break;
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = x.nextInt();
        isPrime(n);
    }
}
