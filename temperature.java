import java.util.Scanner;

public class temperature {
    public static void faheraneit(float c){
       float f=(c*9/5)+32;
       System.out.println(f);
    }
    public static void celscius(float f){
        float c=(5/9)*(f-32);
        
     }
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float f=0;
        float c =0;

        System.out.println("Enter the value c");
        c = sc.nextFloat();
        faheraneit(c);
        

        System.out.println("Enter the value f");
        f = sc.nextFloat();
        celscius(f);
        System.out.println(c);

        sc.close();

        
     }
}
