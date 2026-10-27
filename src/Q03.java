package Q03;

// a)
class Student {
    private String studentId;
    private String studentName;

    // b)
    public static String universityName;

    // c)
    public Student() {
        this("Not assigned", "Unknown");
    }


    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }


    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("University: " + universityName);
        System.out.println();
    }
}

public class Q03 {
    public static void main(String[] args) {
        // d)
        Student.universityName = "SLIIT";


        Student student1 = new Student("IT001", "Gimhana");
        Student student2 = new Student("IT002", "Nimal");
        Student student3 = new Student("IT003", "Amali");

        System.out.println("---- Before Changing University ----");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();


        Student.universityName = "ABC University";


        System.out.println("----- After Changing University ----");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}