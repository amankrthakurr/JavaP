public class Addition
{
    public static void main(String[] args)
    {
        int[][] a = {{1,2,3,4},{2,4,6,9},{1,3,5,7}};
        int[][] b = {{1,2,3,4},{1,3,5,7},{2,4,6,8}};
        int[][] c = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length ; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
