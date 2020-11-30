import java.util.Scanner;
public class test{
public static void main(String []args){
   happyNumber a=new happyNumber();

 System.out.println("Enter A Number");
  Scanner sc=new Scanner(System.in);
 int i=sc.nextInt();
 boolean result=true;
if(result==a.hN(i))

      System.out.println(+i+" is a happy number");
  else 
      System.out.println(+i+" is an unhappy number");
 }
}

