public class CheckingAccount extends Account{
   public static int numberOfAccount=0;
   public CheckingAccount(){
      super(0.0);
      numberOfAccount++;
   }
   public CheckingAccount(double b){
      super(b);
      numberOfAccount++;
   }
}