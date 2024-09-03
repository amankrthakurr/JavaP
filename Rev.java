public class Rev
{
    static int reverse(int n)
    {
        int rem;
        int rev = 0;
        while(n!=0)
        {
            rem = n%10;
            rev = rem+rev*10;
            n/=10;
        }
        return rev;
    }

    static void reverse(int A[])
    {
        int i,j;
        int[] B = new int[A.length];
        for(i = 0 ,j = A.length - 1 ; i < A.length ; i++, j--)
        {
            B[i] = A[j];
        }
        for(int x:B)
            System.out.println(x);
    }
    public static void main(String[] args)
    {
        int A[] = {1,2,3,4,5,6,7,8,9};
        reverse(A);
    }
}
