import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("ENter the value in array :");
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index of the array you want to access ");
       try {
           int index=sc.nextInt();
           System.out.println("The array element at index "+index+"="+arr[index]);
           System.out.println("The array element successfully accessed");
       }
       catch (IndexOutOfBoundsException e)
       {
           System.out.println("Array out of bound index");
       }

    }
}
