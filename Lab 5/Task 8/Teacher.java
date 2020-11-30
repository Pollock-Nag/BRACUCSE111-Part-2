public class Teacher{
  public String name = "";
  public String dep;
  public String courseN="";
  
  public Teacher(){
    
  }
  public Teacher(String n, String d){
    name = n;
    dep = d;
  }
  
  public void addCourse(Course x){
    courseN=courseN+"\n"+x.courseName;
  }
  public void printDetail(){
    System.out.println("========================"+"\n"+
                       "Name: "+name+"\n"+
                       "Department: "+dep+"\n"+
                       "List of courses"+"\n"+
                       "========================"+""
                       +courseN+"\n"+
                       "========================");
  }
}