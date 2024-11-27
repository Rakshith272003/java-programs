import java.util.Scanner;

public class goodSrting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String str =sc.next();
        if ((str.charAt(0) =='a') && (str.length()>3)){
            System.out.println("Good String");

        }else{
            System.out.println("Not Good String");
        }
    }
}

