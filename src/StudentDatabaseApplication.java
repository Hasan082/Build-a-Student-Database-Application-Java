import java.util.Scanner;

public class StudentDatabaseApplication {

    /**
     * The main method serves as the entry point for the application.
     * It creates an array of Student objects, prompts the user to input student
     * data,
     * and displays the information for each student.
     *
     * @param args command line arguments (not used)
     * @throws Exception if an input or formatting error occurs
     */
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter number of students: ");
        int numOStudents = Student.checkIntegerInput(in); // Read the number of students

        // Create an array to store Student objects
        Student[] students = new Student[numOStudents];

        // Loop through the number of students to gather data
        for (int i = 0; i < students.length; i++) {
            // Create a new Student object
            students[i] = new Student(in);

            // Enroll the student in courses
            students[i].enroll(in);

            // Prompt the student to pay tuition
            students[i].payTution();

            // Print a blank line for formatting
            System.out.println(" ");
        }

        // Loop through the students array to display information
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " info:");
            students[i].showInfo(); // Display student info
        }

        // Close the scanner to prevent resource leaks
        in.close();
    }
}
