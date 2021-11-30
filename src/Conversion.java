public class Conversion {
    public static void main(String[] num) {
        int a=Integer.parseInt(num[0]);
        System.out.println("Java test "+num[0]);
        System.out.println("Given number "+num[0]);
        System.out.println("Binary equivalent "+Integer.toBinaryString(a));
        System.out.println("Octal Equivalent "+Integer.toOctalString(a));
        System.out.println("Hexadecimal equivalent "+Integer.toHexString(a));
    }
}
