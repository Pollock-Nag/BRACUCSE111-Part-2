//substring(int)
import java.util.Scanner;
public class Lab07_Task14{  
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
    System.out.println("Where to start from?");
    int n=sc.nextInt();
    Mystring m=new Mystring(s);
    System.out.println(m.substring(n));
  }
}
  