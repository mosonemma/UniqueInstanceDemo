public class UniqueInstanceDemo {
    private int uniqueId;       // Unique ID for each instance
    private String name;        // Name of the instance
    private static int counter = 0; // Static counter to generate unique IDs

    // Instance Initialization Block (IIB)
    {
        counter++;
        uniqueId = counter;
        System.out.println("IIB executed: uniqueId assigned as " + uniqueId);
    }

    // Constructor
    public UniqueInstanceDemo(String name) {
        this.name = name;
        System.out.println("Constructor executed for name: " + name);
    }

    // Getters
    public int getUniqueId() {
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    // New method for this branch: displayInfo
    public String displayInfo() {
        return "ID: " + uniqueId + ", Name: " + name;
    }

    @Override
    public String toString() {
        return "UniqueInstanceDemo[ID=" + uniqueId + ", Name=" + name + "]";
    }

    // Main method to test
    public static void main(String[] args) {
        UniqueInstanceDemo obj1 = new UniqueInstanceDemo("Alice");
        UniqueInstanceDemo obj2 = new UniqueInstanceDemo("Bob");
        UniqueInstanceDemo obj3 = new UniqueInstanceDemo("Charlie");

        System.out.println("\n--- Instance Details ---");
        System.out.println(obj1.displayInfo());
        System.out.println(obj2.displayInfo());
        System.out.println(obj3.displayInfo());
    }
}
