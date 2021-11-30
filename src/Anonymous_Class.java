class greeting{
    public void sayhello()
    {
        System.out.println("Hello");
    }
}
class India
{
    greeting obj=new greeting(){
        public void sayhello()
        {
            System.out.println("Namaste");
        }
    };
}
public class Anonymous_Class {
    public static void main(String[] args) {
        India a=new India();
        a.obj.sayhello();
        greeting b=new greeting();
        b.sayhello();
    }
}
