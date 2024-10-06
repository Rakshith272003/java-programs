import java.io.*;
import java.util.*;

public class StreamReader {
    public static void main(String args[]) throws Exception{
        int a;
        int b;
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);

        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        int sum = a+b;
        System.out.println(sum);
    }
    
}
