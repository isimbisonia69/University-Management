public class Course  {
    private String courseName;
    private int courseId;
    private String courseDescription;
    private int courseCredit;

    public Course(String courseName,int courseId,String courseDescription,int courseCredit){
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseDescription = courseDescription;
        this.courseCredit = courseCredit;
    }

    public String getCourseName(){
        return courseName;
    }
    public int getCourseId(){
        return courseId;
    }
    public String getCourseDescription(){
        return courseDescription;
    }
    public int getCourseCredit(){
        return courseCredit;
    }

    public void setCourseName(){
        this.courseName = courseName;

    }
    public void setCourseId(){
        this.courseId = courseId;
    }
    public void setCourseDescription(){
        this.courseDescription =courseDescription;
    }
    public void setCourseCredit(){
        this.courseCredit = courseCredit;
    }

@Override
    public String toString(){
        return "courseName:"+courseName+",courseId:"+courseId+",courseDescription:"+courseDescription;
}
}
