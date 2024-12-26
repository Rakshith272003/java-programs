package HierarchicalInheritance;

import java.util.Scanner;

public class Teaching extends Staff{
    String Domain;
    String Publications;

    public void accept(){
        Scanner sc =new Scanner(System.in);
        super.accept();
        System.out.println("Enter the Domain");
        Domain=sc.next();
        System.out.println("Enter the Publications ");
        Publications=sc.next();

    }

    public void dispaly(){
        super.dispaly();
        System.out.println("Domain="+Domain);
        System.out.println("Publications="+Publications);
    }
}
