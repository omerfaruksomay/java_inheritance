public class Course {
    private String name;
    private String code;
    private Instructor instructor;

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Course(String name, String code, Instructor instructor) {
        this.name = name;
        this.code = code;
        this.instructor = instructor;
    }

    public double calculateAvarage(Student[] students) {
        double total = 0;
        for (Student student : students) {
            total += student.getNote();
        }
        return total / students.length;
    }
}
