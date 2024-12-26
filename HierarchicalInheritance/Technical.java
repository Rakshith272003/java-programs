package HierarchicalInheritance;

import java.util.Scanner;

public class Technical extends Staff{
    String Skill;


    public void accept(){
        super.accept();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Skill");
        Skill=sc.next();

    }

    public void dispaly(){
        super.dispaly();
        System.out.println("Skill="+Skill);

    }
}
