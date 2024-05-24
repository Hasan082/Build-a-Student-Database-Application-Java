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

    // enrol in courses
    public void enroll() {
        while (true) {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            } else {
                break;
            }
        }
        System.out.println("Current course: " + courses);
        System.out.println("Tution Balance: $" + tutionBalance);
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your tution balance is: $" + tutionBalance);
    }

    // pay tution fee
    public void payTution() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount, you want to pay: $");
        int payment = in.nextInt();
        in.nextLine(); // consume new line
        tutionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // show status

}
