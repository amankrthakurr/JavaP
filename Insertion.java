class Insertion
{
    public static void main(String[] agrs)
    {
        int[] A = new int[10];
        A[0] = 6;
        A[1] = 3;
        A[2] = 4;
        A[3] = 10;
        A[4] = 2;
        int v = 16;
        System.out.println("Before Insertion: ");
        for(int i = 0; i<A.length; i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println("\nAfter Insertion: ");
        for(int i = 2; i< A.length-5; i++)
        {
            A[i] = A[i-1];
        }
        A[2] = v;
        for(int i = 0; i<A.length; i++)
        {
            System.out.print(A[i]+",");
        }
    }
}