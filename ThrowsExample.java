package tripillarAssignment2.module5;
public class ThrowsExample {
    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Oops! You cannot divide by zero.");
        }

        System.out.println("The program continues to run...");
    }

    private static void divide() {
    }
}

    