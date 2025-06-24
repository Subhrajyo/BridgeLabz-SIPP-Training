public class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1); // Using copy constructor

        System.out.println("Original: " + p1.name + ", " + p1.age);
        System.out.println("Copy: " + p2.name + ", " + p2.age);
    }
}
