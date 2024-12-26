package MultilevelInheritance;

public class Parent extends GrandParent{
    public void dispalyParent(){
        System.out.println("Hi i Parent and son of Grandparent");
        super.displayGrandparent();
    }
}
