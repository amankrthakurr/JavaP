import java.sql.SQLOutput;

public class Method1
{
    static int max(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;

    }
    public static void main(String[] args)
    {
        int x = 10;
        int y = 12;
        int z = max(x,y);
        System.out.println("Maxiumum Number = "+z);
    }
}
