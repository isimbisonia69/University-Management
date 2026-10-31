public class Instructor extends UniversityMember{
   private String department;
   public Instructor(String department,String name,String email,int id) {
       super(name,email,id);
       this.department = department;


   }
   public String getDepartment(){
       return department;
   }
   public void setDepartment(String department){
       this.department = department;
   }
   @Override
    public String toString(){
       return "department:"+department +","+super.toString();




   }

}
