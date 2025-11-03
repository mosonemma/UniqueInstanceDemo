import java.util.concurrent.atomic.AtomicInteger;

public class UniqueInstanceDemo {
    private int uniqueId;
    private String name;
    private static final AtomicInteger counter = new AtomicInteger(0);

    {
        uniqueId = counter.incrementAndGet();
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

    public static void resetCounter() {
        counter.set(0);
        System.out.println("Counter reset.");
    }

    // New: create N instances and print them (useful for quick demos)
    public static void createAndPrint(int n) {
        for (int i = 1; i <= n; i++) {
            UniqueInstanceDemo obj = new UniqueInstanceDemo("Generated-" + i);
            System.out.println(obj);
        }
    }

    @Override
    public String toString() {
        return "UniqueInstanceDemo{ID=" + uniqueId + ", name='" + name + "'}";
    }

    public static void main(String[] args) {
        createAndPrint(5);
    }
}
