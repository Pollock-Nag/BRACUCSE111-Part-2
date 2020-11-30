//length()
import java.util.Scanner;
public class Lab07_Task01{  
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
    Mystring m=new Mystring(s);
    System.out.println(m.length());
  }
}