public class Main {
    public static void main(String[] args) {
        University university = new University("Tech University"); // Исправлено название класса
        Professor professor = new Professor("Mr. Smith", 45);
        Course course = new Course("Data Structures", 4, 789123); // Изменено имя переменной на с маленькой буквы

        university.display(); // Метод display() вызывается корректно
        professor.display();
        course.display();
    }
}
