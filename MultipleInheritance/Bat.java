package MultipleInheritance;

public class Bat implements Animal,Bird{
    @Override
    public void eat() {
        System.out.println("Bats eat insects");
    }
    public void fly(){
        System.out.println("Bats can fly");
    }
}
