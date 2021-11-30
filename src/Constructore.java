class Cylinder
{
    private int height;
    private int radius;
    public Cylinder() {
        radius=height=1;
    }
    public Cylinder(int r,int h)
    {
      radius=r;
      height=h;
    }
    public int getHeight()
    {
        return height;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setHeight(int h)
    {
        if (h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(int r)
    {
        if (r>=0)
            radius=r;
        else
            radius=0;

    }


}
public class Constructore {
    public static void main(String[] args) {
        Cylinder sc=new Cylinder();
        sc.setHeight(5);
        sc.setRadius(6);
        System.out.println(sc.getHeight());
        System.out.println(sc.getRadius());

    }

}
