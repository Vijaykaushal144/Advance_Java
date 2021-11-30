class MyThread extends Thread
{
    public  void run()
    {
        int i;
        for(i=1;i<10;i++)
        {
            System.out.println(i+"Hello");

        }
    }
}
class  Extend_Thred
{
    public static void main(String[] args) {
        MyThread m=new MyThread();
        m.start();
        int i;
        for(i=1;i<10;i++)
        {
            System.out.println(i+"World");
        }
    }
}
