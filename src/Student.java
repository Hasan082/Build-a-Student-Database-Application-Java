import java.util.Scanner;

public class Student {
    private String fname;
    private String lname;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tutionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor prompt user to enter student a name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.fname = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lname = in.nextLine();

        System.out.print(
                "Choose from below:\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        // set student id
        setStudentId();

        System.out.println(fname + " " + lname + " " + gradeYear + " " + studentId);

    }

    // Generate an id
    private void setStudentId() {
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // enrol

    // view balance

    // pay fees

    // show status

}
