public class MethodOverloading
{
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    static float max(float x, float y)
    {
        return x>y?x:y;
    }
    static int max(int a,int b,int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>c)
            return b;
        else
            return c;
    }
    public static void main(String[] args)
    {
        System.out.println(max(10,15,20));
    }
}
