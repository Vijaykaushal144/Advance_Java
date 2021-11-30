//
//class Subject {
//    private String subId;
//    private String name;
//    private int maxMarks;
//    private int marksObtain;
//
//    public Subject(String subId, String name, int maxMarks, int marksObtain) {
//        this.maxMarks = maxMarks;
//        this.subId = subId;
//        this.name = name;
//    }
//
//    public String getSubId() {
//        return subId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getMaxMarks() {
//        return maxMarks;
//    }
//
//    public int getMarksObtain() {
//        return marksObtain;
//    }
//
//    public void setMarksObtain(int m) {
//    marksObtain=m;
//    }
//    public void setMaxMarks(int mm)
//    {
//        maxMarks=mm;
//    }
//    boolean isQualified()//method
//    {
//        return marksObtain>=maxMarks/10*4;//if mrks is greater than 40% then pass;
//    }
//    public String tostring()
//    {
//        return "\nSubject ID :"+subId+"\nName:"+name+"\nMarks Obtained :"+marksObtain;
//    }
//}
//public class Scops3{
//    public static void main(String[] args) {
//        Subject  a[]=new Subject[3];//object of array;
//        a[0]=new Subject("S101","ds",100);
//        a[1]=new Subject("s1001","Alg",100);
//        a[2]=new Subject ("s103","os",100);
//        for (Subject s:a)
//        {
//            System.out.println(s);
//        }
//    }
//}

import java.util.Scanner;

public class Scops3 {
    public static void main(String[] args) {
        int num1,num2,i,lower;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers=");
        num1=sc.nextInt();
        num2=sc.nextInt();

        for ( lower=num1<num2?num1:num2;lower>=1;lower--) {
            if (num1 % lower == 0 && num2 % lower == 0)
                break;

        }
        System.out.println("Hcf is " + lower);
    }
}
