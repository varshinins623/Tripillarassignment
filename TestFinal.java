package tripillarAssignment2.module4;
class FinalClass {
    void show() {
        System.out.println("Final class example");
    }
}

public class TestFinal extends FinalClass {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}