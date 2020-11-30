//concat()
import java.util.Scanner;
public class Lab07_Task20{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first string");
    String f=sc.nextLine();
    System.out.println("Enter second string");
    String s=sc.nextLine();
    Mystring m=new Mystring(f);
    m.concat(s);
  }
}