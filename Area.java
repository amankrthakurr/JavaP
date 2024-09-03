public class Area
{
    static int area(int l,int b)
    {
        return l*b;
    }
    static double area(double r)
    {
        return Math.PI*r*r;
    }
    static double area(double a,double b, double h)
    {
        return 0.5*(a+b)*h;
    }
    public static void main(String[] args)
    {
        System.out.println(area(10,12,14));
    }
}
