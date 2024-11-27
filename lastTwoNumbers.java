
import java.util.Scanner;

public class lastTwoNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("ENter the value of num1 AND num2");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int a= num1 % 10;
        int b= num2 % 10;
        if(a==b){
            System.out.println("LAst digit are same");
        }
        else{
            System.out.println("LAst digit are not same");
        }


}
}
