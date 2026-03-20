package TripillarAssignment;
class Student {

    String name;
    int marks;

    void display() {
        System.out.println(name + " " + marks);
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.name = "John";
        s.marks = 90;

        s.display();
    }
}
