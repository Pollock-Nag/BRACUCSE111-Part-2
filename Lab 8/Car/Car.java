public class Car{
  public int year;
  public static int count = 0;
  
  public Car (int y){
    year = y;
    count++;
  }
  public static int getObjectCount(){
   return count; 
  }
  public int getYear(){
  return year;
  
  }
  
}