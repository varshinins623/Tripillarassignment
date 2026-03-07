package tripillarAssignment2.module4;

public class GarbageCollectionDemo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo obj = new GarbageCollectionDemo();
        obj = null;   // Object eligible for garbage collection
        System.gc();  // Request JVM to run garbage collector
    }
}