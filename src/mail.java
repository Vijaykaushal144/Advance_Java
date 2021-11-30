public class mail {
    public static void main(String[] args) {
        circle sc=new circle();
        sc.radius=7;
        System.out.println(sc.circumference());
        System.out.println(sc.area());
        System.out.println(sc.perimeter());
    }
}
class  circle{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }


}
