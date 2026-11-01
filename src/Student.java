public abstract class Student extends UniversityMember {
    private String program;

    public Student(String program,String name,String email,int id){
        super(name,email,id);
        this.program = program;
    }


    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program=program;
    }
    public double calculateGPA;
    @Override
    public String toString(){
        return "program:" + program +"," +super.toString();
    }

    public abstract double calculateGPA();
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Program: " + program);
    }
}
