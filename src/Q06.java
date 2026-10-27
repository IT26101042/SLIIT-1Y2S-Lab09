package Q06;

// a)
interface Enrollable {
    void enrollCourse(String courseName);
}


interface Teachable {
    void assignCourse(String courseName);
}

// b)
class Student implements Enrollable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void enrollCourse(String courseName) {
        System.out.println(
                "Student " + name + " enrolled in: " + courseName
        );
    }
}

// c)
class Instructor implements Enrollable, Teachable {
    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    @Override
    public void enrollCourse(String courseName) {
        System.out.println(
                "Instructor " + name + " enrolled in: " + courseName
        );
    }

    @Override
    public void assignCourse(String courseName) {
        System.out.println(
                "Instructor " + name + " is assigned to teach: " + courseName
        );
    }
}

public class Q06 {
    public static void main(String[] args) {
        // d)
        Student student = new Student("Gimhana");
        student.enrollCourse("Object Oriented Programming");

        // d)
        Instructor instructor = new Instructor("Perera");
        instructor.enrollCourse("Advanced Java");
        instructor.assignCourse("Introduction to Java");
    }
}