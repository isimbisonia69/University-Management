package lab2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();

        int choice = -1;

        do {
            try {
                System.out.println("\n===== UNIVERSITY MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Remove Student");
                System.out.println("4. Add Course");
                System.out.println("5. View Courses");
                System.out.println("6. Remove Course");
                System.out.println("7. Enroll Student in Course");
                System.out.println("8. View Students with Courses");
                System.out.println("0. Exit");

                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                input.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter student name: ");
                        String name = input.nextLine();

                        System.out.print("Enter student email: ");
                        String email = input.nextLine();

                        System.out.print("Enter student program: ");
                        String program = input.nextLine();

                        studentDAO.insertStudent(name, email, program);
                        break;

                    case 2:
                        studentDAO.listStudents();
                        break;

                    case 3:
                        System.out.print("Enter student ID: ");
                        int studentId = input.nextInt();

                        studentDAO.deleteStudent(studentId);
                        break;

                    case 4:
                        System.out.print("Enter course name: ");
                        String courseName = input.nextLine();

                        System.out.print("Enter course code: ");
                        String courseCode = input.nextLine();

                        courseDAO.insertCourse(courseName, courseCode);
                        break;

                    case 5:
                        courseDAO.listCourses();
                        break;

                    case 6:
                        System.out.print("Enter course ID: ");
                        int courseId = input.nextInt();

                        courseDAO.deleteCourse(courseId);
                        break;

                    case 7:
                        System.out.print("Enter student ID: ");
                        int enrollStudentId = input.nextInt();

                        System.out.print("Enter course ID: ");
                        int enrollCourseId = input.nextInt();

                        enrollmentDAO.enrollStudent(enrollStudentId, enrollCourseId);
                        break;

                    case 8:
                        enrollmentDAO.listStudentCourses();
                        break;

                    case 0:
                        System.out.println("Thank you for using the system!");
                        break;

                    default:
                        System.out.println("Invalid choice! Select a number between 0 and 8.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                input.nextLine();
                choice = -1;

            } catch (Exception e) {
                System.out.println("Something went wrong: " + e.getMessage());
                input.nextLine();
                choice = -1;
            }

        } while (choice != 0);

        input.close();
    }
}