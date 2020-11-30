//lastIndexOf(char)
import java.util.Scanner;
public class Lab07_Task17{  
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
    System.out.println("Enter char");
    String c=sc.next();
    char cArray[]=c.toCharArray();
    Mystring m=new Mystring(s);
    System.out.println(m.lastIndexOf(cArray[0]));
  }
}