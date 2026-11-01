public class Graduate extends Student {
    private double[] courseGrades;
    private double capstoneGrade;

    public Graduate(double[] courseGrades, double capstoneGrade,String program,String name,String email,int id) {
        super(program,name,email,id);
        this.courseGrades = courseGrades;
        this.capstoneGrade = capstoneGrade;
    }

    @Override

    public double calculateGPA() {
        double total = 0;
        for (double grade : courseGrades)
            total += grade;
        double totalGrades = total + capstoneGrade;
        double average = totalGrades / (courseGrades.length + 1);
        return average / 100 * 5;
    }

        @Override
        public void displayInfo() {
            System.out.println("Graduate Student");
            super.displayInfo();
            System.out.println("Capstone Grade: " + capstoneGrade);
            System.out.println("GPA: " + calculateGPA());



    }
}

