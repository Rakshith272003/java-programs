class Example{
    void instanceMethod(){
        System.out.println("This is an instance method");
    }
}

public class Instancedemo {
    public static void main(String[] args) {
        Example obj =new Example();
        obj.instanceMethod();
    }
}
