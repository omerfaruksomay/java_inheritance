public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Student student1 = new Student("Ömer", "Somay", "1", "Atakent", 95);
        Student student2 = new Student("faruk", "Somay", "2", "Atakent", 75);
        Student student3 = new Student("somay", "Somay", "3", "Atakent", 45);

        Student[] students = {student1, student2, student3};

        Instructor instructor = new Instructor("Ömer Faruk", "Somay", "Engineering");

        Course mat1 = new Course("Matematik", "Mat1", instructor);

        System.out.println(mat1.calculateAvarage(students));

        System.out.println(mat1.getInstructor().getName());


    }
}