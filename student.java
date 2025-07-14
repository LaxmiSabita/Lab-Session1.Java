
public class Student {
    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;

    // Constructor to initialize values
    public Student(String studentName, String collegeName, int studentID) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.studentID = studentID;
    }

    // Getter methods (optional for further use)
    public String getStudentName() { return studentName; }
    public String getCollegeName() { return collegeName; }
    public int getStudentID() { return studentID; }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student("Laxmi", "College", 1001);
        System.out.println("Successful");
    }
}
