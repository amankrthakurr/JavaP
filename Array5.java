class Array5
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,86,23};
        int max = a[0];
        for(int i = 1; i < a.length; i++)
        {
            if(max<a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maxmimum Element "+max);
    }
}