public class Course {
    String name;
    int credits;
    int barcode;

    public Course(String name, int credits, int barcode) {
        this.name = name;
        this.credits = credits;
        this.barcode = barcode;
    }

    public void display() {
        System.out.println("Course Name: " + name);
        System.out.println("Credits: " + credits);
        System.out.println("Barcode: " + barcode);
    }
}

