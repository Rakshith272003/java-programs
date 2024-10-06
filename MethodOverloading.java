import java.io.*;
import java.util.*;
public class MethodOverloading {
    public static int sum(int x,int y){
        return(x+y);
    }
    public static int sum(int x,int y,int z){
        return(x+y+z);
    } 
    public static float sum(float x,float y){
        return(x+y);
    }   
    public static void main(String[] args) {
        MethodOverloading s=new MethodOverloading();
        System.out.println(s.sum(10,12));

    }                
}
