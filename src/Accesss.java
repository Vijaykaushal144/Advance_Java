public class Accesss{
    public static void main(String[] args) {
    Rectangle  sc=new Rectangle();
    sc.setLength(10.5);
    sc.setBreadth(5.5);//changing the length and breadth;
        System.out.println(sc.getLength());
        System.out.println(sc.getBreadth());//it only for reading the value;
    }
}
class Rectangle{
    private  int length;
    private int breadth;
    public double  getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setBreadth(double l)
    {
        length= (int) l;
    }
    public void setLength(double b)
    {
        breadth = (int) b;
    }
}



