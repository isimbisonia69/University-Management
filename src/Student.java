public class Student extends UniversityMember {
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
    @Override
    public String toString(){
        return "program:" + program +"," +super.toString();
    }

}
