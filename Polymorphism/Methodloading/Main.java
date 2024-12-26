package Polymorphism.Methodloading;

public class Main {
    public static void main(String[] args) {
        Calculator calc =new Calculator();
        System.out.println(calc.add(5,7));
        System.out.println(calc.add(5,7,8));
    }
}
