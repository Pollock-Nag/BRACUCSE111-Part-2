public class Tester{
  public static void main(String[] args){
    myString s1 = new myString("Pollock");
    System.out.println(s1.length());
    System.out.println(s1.toString());
    System.out.println(s1.charAt(0));
    System.out.println(s1.startsWith("AB"));
    System.out.println(s1.endsWith("CD"));
    s1.replaceFirst('P','C');
    s1.replaceAll('o','C');
    s1.replaceLast('k','C');
    s1.concat(" Nag");
    System.out.println(s1.toUpperCase());
    System.out.println(s1.toLowerCase());
    System.out.println(s1.equals("Pollock"));
    System.out.println(s1.equalsIgnoreCase("Pollock"));
    System.out.println(s1.subString(10,10));
    System.out.println(s1.indexOf('k', 'c'));
    
    System.out.println(s1.lastIndexOf('k', 'c'));
  }
}