import java.util.Scanner;

public class sumoftwonumbers{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        int a = sc.nextInt();
        int b =sc.nextInt();
        float sum =a+b;
        System.out.println("sum="+sum);
    }
}