import java.io.*;
import java.util.*;

public class SumofnNumbers {
    public static void Whilefunc(int n){
        int i=0;
        int sum=0;
        
        while (i<=n) {
            sum=sum+i;
            i++;  
        }
        System.out.println(sum);
        
    }
    public static void doWhilefunc(int n){
        int i=0;
        int sum=0;
        
     
        do {
            sum=sum+i;
            i++;  
        }while (i<=n);
        System.out.println(sum);
        
    }
    public static void mathform(int n){
        int sum=n*(n+1)/2;
        System.out.println(sum);

    }
    public static void forloopmethod(int n){
   
        int sum=0;
        for(int i=0; i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        doWhilefunc(n);
        Whilefunc(n);
        mathform(n);
        forloopmethod(n);

    }



}
