import java.util.*;
public class Test{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius of Circle:");
    double x = sc.nextDouble();
    System.out.println("Enter volume of Sphere:");
    double y = sc.nextDouble();
    Circle c = new Circle(x);
    System.out.println(c);
    System.out.println();
    Sphere s = new Sphere(y);
    System.out.println(s);
    
    
  }
}