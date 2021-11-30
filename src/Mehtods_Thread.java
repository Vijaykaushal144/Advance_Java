public class Mehtods_Thread {
    public static void main(String[] args) throws InterruptedException {
        MyThred t=new MyThred("My Thread 1");
        t.start();
        int count ;
        for (count=1;count<10;count++){
            System.out.println(count+"Main");
            Thread.yield();

        }


    }
}
class MyThred extends Thread {
    public MyThred(String name) {
        super(name);
    }

    public void run() {
        int count ;
        for (count=1;count<10;count++){
            System.out.println(count+"My thread");

        }
    }
}



