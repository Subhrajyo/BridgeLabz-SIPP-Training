// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass 1: Chef
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println("Cooking delicious " + specialty + " dishes.");
    }
}

// Subclass 2: Waiter
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println("Serving customers at " + tablesAssigned + " tables.");
    }
}
class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Ravi", 101, "Indian");
        Waiter waiter = new Waiter("Amit", 102, 5);

        System.out.println("=== Chef Details ===");
        chef.displayInfo();
        chef.performDuties();

        System.out.println("\n=== Waiter Details ===");
        waiter.displayInfo();
        waiter.performDuties();
    }
}
