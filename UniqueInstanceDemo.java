public class UniqueInstanceDemo {
    private int uniqueId;
    private String name;
    private static int counter = 0;

    {
        counter++;
        uniqueId = counter;
        System.out.println("IIB executed: uniqueId assigned as " + uniqueId);
    }

    public UniqueInstanceDemo(String name) {
        this.name = name;
        System.out.println("Constructor executed for name: " + name);
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    // New: reset the static counter (useful for tests)
    public static void resetCounter() {
        counter = 0;
        System.out.println("Counter has been reset to 0.");
    }

    public static void main(String[] args) {
        UniqueInstanceDemo obj1 = new UniqueInstanceDemo("Alice");
        UniqueInstanceDemo obj2 = new UniqueInstanceDemo("Bob");

        System.out.println("\n--- Before reset ---");
        System.out.println("obj1 ID: " + obj1.getUniqueId());
        System.out.println("obj2 ID: " + obj2.getUniqueId());

        // Reset counter and create another object
        resetCounter();
        UniqueInstanceDemo obj3 = new UniqueInstanceDemo("Charlie");
        System.out.println("\n--- After reset ---");
        System.out.println("obj3 ID: " + obj3.getUniqueId());
    }
}
