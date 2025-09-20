class Person {
    String name;  

    void sayHello() {  
        System.out.println("Hello, my name is " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Person p = new Person(); // object Declaration
        p.name = "Ritesh";       // Set property
        p.sayHello();            // Call method
    }
}
