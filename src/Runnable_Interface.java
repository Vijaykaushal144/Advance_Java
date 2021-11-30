public class Runnable_Interface {
    public static void main(String[] args) {
        Thread t1=new Thread( new a());//object of a bcz it implement interface
        Thread t2=new Thread(new b());
        //System.out.println(i);
        t1.start();
        t2.start();
    }
}
class a implements Runnable
{
    public void run()
    {
        for(int i=0;i<11;i++)
        {
            System.out.println("Thread a:" +i);
        }
    }
}
class b implements Runnable
{
    public void run()
    {
        for(int i=0;i<11;i++)
        {
            System.out.println("Thread b:" +i);
        }
    }
}
