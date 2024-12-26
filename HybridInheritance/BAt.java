package HybridInheritance;

public class BAt extends Animal implements Bird,Mamal{
    @Override
    public void fly() {
        System.out.println("Bat can Fly");
    }

    @Override
    public void walk() {
        System.out.println("Bat can walk");

    }
}
