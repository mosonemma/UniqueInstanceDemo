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

    // Thread-safe reset (for demo; note: careful in production)
    public static void resetCounter() {
        counter.set(0);
        System.out.println("Atomic counter has been reset to 0.");
    }

    public static void main(String[] args) {
        UniqueInstanceDemo obj1 = new UniqueInstanceDemo("Alice");
        UniqueInstanceDemo obj2 = new UniqueInstanceDemo("Bob");
        System.out.println(obj1);
        System.out.println(obj2);
    }

    @Override
    public String toString() {
        return "UniqueInstanceDemo{ID=" + uniqueId + ", name='" + name + "'}";
    }
}
