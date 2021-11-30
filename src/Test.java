public class Test {
    public static void main(String[] args) {
        Rect sc=new Rect();
        sc.getLength();
//        sc.setLength(10);
        System.out.println(sc.getLength());
        //System.out.println(sc.setLength(15));
    }
}
class Rect
{
    private int length;
    private int height;
    public int getLength()
    {
        return length;
    }
    public int setLength(int l)
    {
        if (l>=5) {
            length = l;
        }
        else {
            length = 0;
        }
        return length;
    }

}

