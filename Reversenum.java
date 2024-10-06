import java.io.*;
import java.util.*;

public class Reversenum {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int revnum=0;
        while(num!=0){
            int digit=num%10;
            num=num/10;
            revnum=revnum*10+digit;
        }
        System.out.println("the reverse of the number"+revnum);
        }

    }    

