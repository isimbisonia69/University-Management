public class Main {
    public static void main(String[] args) {
        Student student = new Student("Software Engineering","sonia","soniaisimbi@gmail.com",1);
        Instructor instructor = new Instructor("IT","callixte","callixte@gmail.com",9);
        Course course = new Course("python",123,"Basic programming",12);

        System.out.println("This is student university management system");
        System.out.println("Student Infromation:");
        System.out.println(student);

        System.out.println("Instructor Information:");
        System.out.println(instructor);

        System.out.println("Course Information:");
        System.out.println(course);





    }
}
