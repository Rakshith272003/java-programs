package Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton Instance Created");

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();

        }
        return instance;
    }


    public void displayMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // Access the singleton instance
        Singleton singleton1 = Singleton.getInstance();
        singleton1.displayMessage();
    }
}
