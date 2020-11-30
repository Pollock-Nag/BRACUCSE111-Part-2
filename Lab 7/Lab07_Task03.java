//startsWith()
import java.util.Scanner;
public class Lab07_Task03{  
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
    System.out.println("Starts with?");
    String s2=sc.nextLine();
    Mystring m=new Mystring(s);
    System.out.println(m.startsWith(s2));
  }
}