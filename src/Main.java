public class Main {
    public static void main(String[] args) {

        double[] courseGrade = {56, 78, 90};
        double [] courseGrades = {90,89,78};

        Student undergraduate = new Undergraduate(courseGrade,"Business","Isimbi","isimbisonia@gmail.com",21);
        Student graduate = new Graduate(courseGrades,90,"Health sciences","Shema","shemahaguma@gmail.com",6);
        Instructor instructor =
                new Instructor("IT", "callixte", "callixte@gmail.com", 9);

        Course course =
                new Course("python", 123, "Basic programming", 12, 90);

        System.out.println("This is student university management system");

        System.out.println("Undergraduate Information:");
        System.out.println(undergraduate);

        System.out.println("Instructor Information:");
        System.out.println(instructor);

        System.out.println("Course Information:");
        System.out.println(course);

        System.out.println("GPA for undegraduates" + undergraduate.calculateGPA());
        System.out.println("GPA for graduates:"+graduate.calculateGPA());
        System.out.println("\n--- GRADUATE INFORMATION ---");
        graduate.displayInfo();
        System.out.println("\n---UNDERGRADUATE INFORMATION --");
        graduate.displayInfo();
}
}
