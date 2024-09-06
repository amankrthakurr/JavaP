class Copying
{
    public static void main(String[] args)
    {
        int[] a = {12,9,99,7,16,45,86,23};
        int n = a.length;
        int[] b = new int[n];
        for(int i = 0; i<a.length; i++)
        {
            b[i]=a[i];
        }
        for(int i = 0; i<b.length; i++)
        {
            System.out.print(b[i] + " ");
        }
        
    }
}