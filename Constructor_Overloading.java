class Student {
    String name;
    int age;

    Student() {
        this("Ritesh", 20); 
    }

  
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        Student s2 = new Student("Ritesh", 21); 

        s1.display();
        s2.display();
    }
}
