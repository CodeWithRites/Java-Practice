class Student {
    String name;
    int age;

    Student() {
        name = "RITESH";
        age = 20;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(); 
        s1.display();
    }
}
