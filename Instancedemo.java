class ExampleDemo{
    void instanceMethod(){
        System.out.println("This is an instance method");
    }
}

public class Instancedemo {
    public static void main(String[] args) {
        ExampleDemo obj = new ExampleDemo();
        obj.instanceMethod();
    }
}
