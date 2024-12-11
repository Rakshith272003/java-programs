package Static;

public class Human {
    int age;
    String name;
    char gender;
    boolean married;
    static long population;

    public Human(int age, char gender, boolean married, String name) {
        this.age = age;
        this.gender = gender;
        this.married = married;
        this.name = name;
        Human.population+=1;
    }
}

