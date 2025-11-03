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

    @Override
    public String toString() {
        return "UniqueInstanceDemo{ID=" + uniqueId + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
        UniqueInstanceDemo obj1 = new UniqueInstanceDemo("Alice");
        UniqueInstanceDemo obj2 = new UniqueInstanceDemo("Bob");
        UniqueInstanceDemo obj3 = new UniqueInstanceDemo("Charlie");

        System.out.println("\n--- Instance Details (toString) ---");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
