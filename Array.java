import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void Array1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        
        System.out.println("the array size is"+arr.length);

    }
    public static void Array2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an ARRAY");
        int size=sc.nextInt();
        String [] arr = new String[size];
        System.out.println("enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.next();
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Array1();
        Array2();
    }
}
