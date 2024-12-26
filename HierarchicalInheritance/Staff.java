package HierarchicalInheritance;

import java.util.Scanner;

public class Staff {
    int Staff_id;
    String Name;
    long Phn;
    float Salary;

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the StaffID");
        Staff_id=sc.nextInt();
        System.out.println("Enter the Name");
        Name=sc.next();
        System.out.println("Enter the Phn");
        Phn =sc.nextLong();
        System.out.println("Enter the Salary");
        Salary =sc.nextFloat();
    }

    public void dispaly(){
        System.out.println("StaffID="+Staff_id);
        System.out.println("Name="+Name);
        System.out.println("Phn="+Phn);
        System.out.println("Salary="+Salary);
    }
}
