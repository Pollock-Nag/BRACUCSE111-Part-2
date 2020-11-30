public class Sphere extends Point{
  public Sphere(double rad){
  super(rad);
  }
  public double vol(){
  return 4/3*Math.PI*Math.pow(getRadius(),3);
  }
  public String toString(){
  return "Enter radius of Sphere:"+getRadius()+"\n"+"Creating a Sphere … done!"+"\n"+"The area of the Sphere is "+vol();
  }
}
