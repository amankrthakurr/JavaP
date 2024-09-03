public class Method2
{
    static void update(int[] X)
    {
        X[0] = 22;
    }
    public static void main(String[] args)
    {
        int[] A = {3,4,10,7,32,9};
        update(A);
        System.out.println(A[0]);
    }
}
