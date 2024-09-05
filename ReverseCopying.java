class ReverseCopying
{
    public static void main(String[] args)
    {
        int[] a = {9,8,3,5,8,6,2};
        int[] b = new int[a.length];
        for(int i = 0,j = a.length-1; i < a.length,j>=0; i++,j--)
        {
            b[j] = a[i];
        }
        for(int i = 0; i<b.length; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}