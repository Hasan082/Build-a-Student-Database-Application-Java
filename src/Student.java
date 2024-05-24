import java.util.Scanner;

public class Student {
    private String fname;
    private String lname;
    private int gradeYear;
    private int studentId;
    private String courses;
    private int tutionBalance;
    private static int costOfCourse = 600;
    private static int id = 1001;

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
        System.out.println(fname + " " + lname + " " + gradeYear);
    }
    // Generate an id

    // enrol

    // view balance

    // pay fees

    // show status

}
