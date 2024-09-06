class Array4
{
    public static void main(String[] args)
    {
        int search = 6;
        int[] a = {1,2,3,4,5,6,86,23};

        for(int i = 0; i< a.length ; i++)
        {
            if(a[i]==search)
            {
                System.out.println("Element Found at index "+i);
                break;
            }
        }
    }
}