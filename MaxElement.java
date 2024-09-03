public class MaxElement
{
    static int maxElement(int A[])
    {
        int max = A[0];
        for(int i = 0; i < A.length ; i++)
        {
            if(max<A[i])
                max = A[i];
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] A = {3,2,7,8,1,5};
        System.out.println("Maximum Element: "+maxElement(A));
    }
}
