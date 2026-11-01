public class Undergraduate extends Student {
    private double[] courseGrade;

    public Undergraduate(double[] courseGrade, String program, String name, String email, int id) {
        super(program, name, email, id);
        this.courseGrade = courseGrade;
    }

    @Override
    public double calculateGPA() {
        double total = 0;
        for (double grade : courseGrade) {
            total += grade;
        }

        double average = total / courseGrade.length;
        return average / 100 * 5;

    }

    @Override
    public void displayInfo() {
        System.out.println("Undergraduate Student");
        super.displayInfo();

    }
}
