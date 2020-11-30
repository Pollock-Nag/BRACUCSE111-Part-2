//charAt ()
import java.util.Scanner;
public class Lab07_Task02{  
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.next();
    int n=sc.nextInt();
    Mystring m=new Mystring(s);
    char c=m.charAt(n);
    if(c!='\u0000'){
    System.out.println(m.charAt(n));
    }
    else{
    System.out.println("Invalid Index");
    }
  }
}