//endsWith()
import java.util.Scanner;
public class Lab07_Task04{  
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
    System.out.println("Ends with?");
    String s2=sc.nextLine();
    Mystring m=new Mystring(s);
    System.out.println(m.endsWith(s2));
  }
}