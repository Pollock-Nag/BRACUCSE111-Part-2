public class Circle extends Point{
  public Circle(double radius){
    super(radius);
  }
  public double area(){
    return Math.PI*getRadius()*getRadius();
    
  }
  public String toString(){
    return "Enter radius of Circle:"+getRadius()+"\n"+"Creating a Circle … done!"+"\n"+"The area of the Circle is "+area();
      
  }
}