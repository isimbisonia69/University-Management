import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class UniversityManagement {

    private List<Student> students = new ArrayList<>();
    private Set<Student> uniqueStudents = new HashSet<>();
    private Map<Integer, Course> studentCourses = new HashMap<>();

    public void enrollStudent(Student student) {
        students.add(student);
        uniqueStudents.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public int countStudents() {
        return students.size();
    }

    public int countUniqueStudents() {
        return uniqueStudents.size();
    }
    public void assignCourse(int studentId, Course course) {
        studentCourses.put(studentId, course);
    }

    public void displayCourses() {
        for (Map.Entry<Integer, Course> entry : studentCourses.entrySet()) {
            System.out.println("Student ID: " + entry.getKey());
            System.out.println("Course: " + entry.getValue());
        }
    }



}