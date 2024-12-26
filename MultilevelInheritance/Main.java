package MultilevelInheritance;

public class Main {
    public static void main(String[] args) {
        Parent parents = new Parent();
        parents.dispalyParent();

        Child children = new Child();
        children.displayGrandparent();
        children.displayChild();
        children.dispalyParent();

    }
}

