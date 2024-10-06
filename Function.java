import java.io.*;
import java.util.*;

public class Function {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a= sc.nextInt();
        System.out.println("Enter the value of b");
        int b= sc.nextInt();
        System.out.println("Enter the value of c");
        int c= sc.nextInt();
        System.out.println("Enter the value of d");
        int d= sc.nextInt();
        int sum=sumofFour(a,b,c,d);
        System.out.println("The sum of four numbers is"+sum);
    }
    public static int sumofFour(int i,int j,int k,int l){
        int s=i+j+k+l;
        return s;
        

    }
}
