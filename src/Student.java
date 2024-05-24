import java.util.Scanner;

public class Student {
    private String fname;
    private String lname;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tutionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    /**
     * Constructor prompts the user to enter the student's first name, last name,
     * and year level, then generates a unique student ID.
     */
    public Student(Scanner in) {

        // Prompt user to enter first name
        System.out.print("Enter student first name: ");
        this.fname = in.nextLine();

        // Prompt user to enter last name
        System.out.print("Enter student last name: ");
        this.lname = in.nextLine();

        // Prompt user to enter grade year
        System.out.print(
                "Choose from below:\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior\nEnter student class level: ");
        this.gradeYear = checkIntegerInput(in);

        // Set student ID
        setStudentId();
    }

    /**
     * Generates a unique student ID based on the grade year and a static counter.
     */
    private void setStudentId() {
        id++;
        this.studentId = gradeYear + "" + id;
    }

    /**
     * Reads an integer input from the provided Scanner object, handling exceptions
     * gracefully.
     * 
     * @param in The Scanner object to read input from.
     * @return The integer value entered by the user.
     */
    public static int checkIntegerInput(Scanner in) {
        int value;
        while (true) {
            try {
                value = in.nextInt();
                in.nextLine();
                break;
            } catch (Exception e) {
                System.out.print("Invalid input. Try again: ");
                in.nextLine();
            }
        }
        return value;
    }

    /**
     * Enrolls the student in courses. Prompts the user to enter courses until 'Q'
     * is entered.
     * Each course costs a fixed amount and adds to the tuition balance.
     */
    public void enroll(Scanner in) {
        while (true) {
            System.out.print("Enter course to enroll (Q to quit): ");
            String course = in.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                courses = courses + "\n  " + course;
                tutionBalance += costOfCourse;
            } else {
                break;
            }
        }
    }

    /**
     * Displays the student's current tuition balance.
     */
    public void viewBalance() {
        System.out.println("Your tuition balance is: $" + tutionBalance);
    }

    /**
     * Prompts the user to enter a payment amount and updates the tuition balance
     * accordingly.
     */
    public void payTution() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount that you want to pay: $");
        int payment = checkIntegerInput(in);
        tutionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    /**
     * Displays the student's information, including name, grade year, student ID,
     * enrolled courses, and tuition balance.
     */
    public void showInfo() {
        System.out.println("\nName: " + fname + " " + lname);
        System.out.println("Grade Year: " + gradeYear);
        System.out.println("Student ID: " + studentId);
        System.out.println("Courses Enrolled: " + courses);
        System.out.println("Tuition Balance: $" + tutionBalance + "\n");
    }
}
