public class Constructor_Inheritance {
    public static void main(String[] args) {
        grandfather sc=new grandfather();

    }
}
class parent
{
    public parent()
    {
        System.out.println("Parent class ");
    }
}
class child extends parent
{
    public child()
    {
        System.out.println("child class");
    }
}
class grandfather extends child
{
    public grandfather()
    {
        System.out.println("Grand father");
    }
}

