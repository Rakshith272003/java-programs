import java.util.*;;
public class ArrayListBasic {
    public static void main(String args []){
        ArrayList <String> list= new ArrayList<>(10);
        list.add("Bananna");
        list.add("orange");

        System.out.println(list);

        int size=list.size();
        System.out.println("the size of an Arraylist is"+size);
        

        list.remove("Bananna");
        System.out.println(list);

    
    }        
}
