public class Professor {
    String name;
    int age;

    public Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Professor Name: " + name);
        System.out.println("Age: " + age);
    }
}
