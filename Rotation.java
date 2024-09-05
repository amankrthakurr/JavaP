class Rotation
{
    public static void main(String[] args)
    {
        int[] a = {12,9,99,7,16,45,86,23};
        int temp = a[0];
        for(int i = 0; i<a.length-1; i++)
        {
            a[i] = a[i+1];
        }
        a[a.length-1] = temp;
        for(int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}