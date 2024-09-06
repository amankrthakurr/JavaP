class Array6
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,86,23};
        int max1 = a[0];
        int max2 = a[0];
        for(int i = 1; i < a.length; i++)
        {
            if(max1<a[i])
            {
                max1 = a[i];
            }
            else if(max2<a[i])
            {
                max2 = a[i];
            }
        }
        System.out.println("Second Largest Element: "+max2);
    }
}