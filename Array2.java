class Array2
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        int[] b = new int[10];
        int c[];
        c= new int[10];
        for(int i = 0; i< a.length ; i++)
        {
            System.out.println(a[i]++);
        }
        for(int x: a)
        {
            System.out.println(x);
        }

    }
}