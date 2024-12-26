package MultilevelInheritance;

public class Child extends Parent{
    public void displayChild(){
        System.out.println("THIS IS CHILD CLASS");
        dispalyParent();
        displayGrandparent();

    }
}
