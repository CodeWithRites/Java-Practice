class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }


    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    void checkAdult() {
        if(age >= 18) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is not an adult.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Create objects
        Student s1 = new Student("Ritesh", 20);
        Student s2 = new Student("Anita", 16);

        // Call methods
        s1.displayInfo();
        s1.checkAdult();
        System.out.println();
        s2.displayInfo();
        s2.checkAdult();
    }
}
