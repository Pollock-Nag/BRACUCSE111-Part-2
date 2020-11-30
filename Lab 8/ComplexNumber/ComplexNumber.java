public class ComplexNumber extends RealNumber{
  private double imaginary;
  public ComplexNumber(){
  setRealValue(1.0);
  double imaginary=1.0;
  }
  public String toString(){
  System.out.print(super.toString());
  return "\n"+"ImaginaryPart: "+imaginary;
  
  }
  public ComplexNumber(double x , double y){
  setRealValue(x);
  double imaginary=y;
  }
  
  public void check(){
  System.out.println("I'm in ComplexNumber class");
  ping();
  System.out.println("Cheacking ended.");
  }
}