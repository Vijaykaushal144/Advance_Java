public class Inheritance {
    public static void main(String[] args) {
        Cyli c=new Cyli();
        c.height=7;
        c.radius=10;
        System.out.println(c.ara()+" "+c.volume());
    }
}
class Cir
{
    public double radius;
    public double ara()
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
class Cyli extends Cir
{
 public double height;
 public double volume()
 {
     return ara()*height;

 }
}

