# Student Database Application

### Overview: 
This Java application allows users to manage student information, including enrollment, tuition payment, and display of student details. The application is built using object-oriented principles and utilizes the Scanner class for user input.

### Features:
1. **Student Class:**
   - Represents a student with attributes such as first name, last name, grade year, student ID, enrolled courses, and tuition balance.
   - Provides methods to enroll students in courses, view tuition balance, make tuition payments, and display student information.

2. **StudentDatabaseApplication Class:**
   - Entry point of the application.
   - Prompts the user to input the number of students and student details.
   - Creates an array of Student objects, gathers student data, and displays student information.

**How to Run:**
1. Compile both Java files (`Student.java` and `StudentDatabaseApplication.java`) using a Java compiler.
   ```
   javac Student.java StudentDatabaseApplication.java
   ```

2. Run the compiled `StudentDatabaseApplication` class.
   ```
   java StudentDatabaseApplication
   ```

3. Follow the on-screen prompts to input student information, enroll students in courses, and make tuition payments.

### Functionality:
- **Enrollment:** Users can enroll students in courses by entering the course name. Courses are added to the student's course list, and the tuition balance is updated accordingly.
- **Tuition Payment:** Users can make tuition payments by entering the payment amount. The payment amount is subtracted from the student's tuition balance.
- **Display Student Information:** After inputting student details and enrollment, the application displays each student's information, including name, grade year, student ID, enrolled courses, and tuition balance.

### Note:
- Ensure Java Development Kit (JDK) is installed on your system to compile and run the application.
- Use the command line or an integrated development environment (IDE) such as Eclipse or IntelliJ IDEA to compile and run the Java files.
- The application handles user input validation for integer values and gracefully handles exceptions during input.
- Feel free to extend the functionality of the application as needed.

###  Contributors:
- MD HASANUZZAMAN, FULL STACK DEVELOPER

### Version History:
- Version 1.0: Initial release (05/24/2024)

### License:
This project is licensed under the [MIT License](https://opensource.org/license/mit).
