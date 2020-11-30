//replaceFirst(char,char)
import java.util.Scanner;
public class Lab07_Task05{  
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
    System.out.println("Old char");
    String c1=sc.next();
    char c1Array[]=c1.toCharArray();
    System.out.println("New char");
    String c2=sc.next();
    char c2Array[]=c2.toCharArray();
    Mystring m=new Mystring(s);
    m.replaceFirst(c1Array[0],c2Array[0]);
  }
}