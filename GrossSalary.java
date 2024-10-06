import java.io.*;
import java.util.*;

public class GrossSalary {
    public static void main(String args[]) throws Exception{
        float har,da;
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);
        
        System.out.println("Enter the BASIC SALARY");
        float basicsalary = Float.parseFloat(br.readLine());

        if (basicsalary<=10000){
            har=0.2f*basicsalary;
            da=0.8f*basicsalary;
        }
        else if( basicsalary<=20000){
            har=0.25f*basicsalary;
            da=0.90f*basicsalary;

        }
        else{
            har=0.30f*basicsalary;
            da=0.95f*basicsalary;
        }

         float grosssalary= basicsalary+har+da;
         System.out.println(grosssalary);

    }
}
