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

        list.set(0,"Mango");
        System.out.println(list);

        list.add("Bananna");
        list.add("Grapes");
        list.add("Pineapple");

        String firstelement=list.get(0);
        System.out.println("First element"+firstelement);

        System.out.println(list.contains("Apple"));


    }     
}
