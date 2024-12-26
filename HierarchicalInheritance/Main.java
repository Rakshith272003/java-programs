package HierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        Teaching teaching =new Teaching();
        System.out.println("Enter the Details of Teaching Staff");
        teaching.accept();
        System.out.println("The Details of the teaching satff is as follows");
        teaching.dispaly();


        Technical technical =new Technical();
        System.out.println("Enter the Details of Teaching Staff");
        technical.accept();
        System.out.println("The Details of the teaching satff is as follows");
        technical.dispaly();

    }
}
