import java.io.*;
import java .util.*;
public class Armstrongnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int digit,sum=0;
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        do{
            digit=num%10;
            num=num/10;
            sum=sum+digit*digit*digit;
        }while(num!=0);

        if(sum==temp){
            System.out.println("The Number is Armstrong");
        }
        else{
            System.out.println("The Number is not Armstrong");
        }
    }
    
}
