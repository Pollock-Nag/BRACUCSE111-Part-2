public class myString {
  public char [] array1;
  //public char[] array2;
  public myString (String s1){
    array1 = s1.toCharArray();
  }
  
  //length()
  
  public int length(){
    return array1.length;
  }
  
  //charAt
  
  
  public char charAt(int n){
    if(n<array1.length){
      return array1[n];
    }
    else{
      return (char)0;
    }
  }
  
//toString()
  public String toString(){
    String s="";
    for(int i=0; i<array1.length;i++){
      s=s+array1[i];
    }
    return s;
  }
  
  //startsWith
  public boolean startsWith(String s2){
    char[] array2;
    array2 = s2.toCharArray();
    boolean j=true;
    if(array1.length>array2.length || array2.length!=0){
      
      for(int i =0 ; i<array2.length;i++){
        if (array2[i]== array1[i]){
          
          j = true;
        }
        else {
          j = false;
          break;
        }
      }
    }
    return j;
  }
  
  //endsWith
  public boolean endsWith(String s2){
    char[] array2;
    array2 = s2.toCharArray();
    boolean j=true;
    if(array1.length>array2.length || array2.length !=0){
      
      for(int i =array2.length-1 ; i>0 ;i--){
        if (array2[i]== array1[array1.length-array2.length+i]){
          j = true;
        }
        else {
          j = false;
          break;
        }
      }
    }
    return j;
  }
  
  //replaceFirst()
  
  public void replaceFirst(char old , char neew){
    int c =0 ;
    for(int i = 0; i<array1.length;i++){
      if(array1[i]==old){
        c++;
        array1[i]=neew;
        break;
      }
    }
    String newString="";
    if (c!=0){
      for(int i =0 ; i<array1.length; i++){
        
        newString = newString+array1[i];
      }
    }
    else {
      newString = "Invalid index";
    }
    System.out.println(newString);
  }
  
  //replaceAll()
  
  public void replaceAll(char old , char neew){
    int c =0 ;
    for(int i = 0; i<array1.length;i++){
      if(array1[i]==old){
        c++;
        array1[i]=neew;
      }
    }
    String newString="";
    if (c!=0){
      for(int i =0 ; i<array1.length; i++){
        
        newString = newString+array1[i];
      }
    }
    else {
      newString = "Invalid index";
    }
    System.out.println(newString);
  }
  
  //replaceLast()
  
  public void replaceLast(char old , char neew){
    int c =0 ;
    for(int i = array1.length-1; i>0; i--){
      if(array1[i]==old){
        c++;
        array1[i]=neew;
        
      }
    }
    String newString="";
    if (c!=0){
      for(int i =0 ; i<array1.length; i++){
        
        newString = newString+array1[i];
      }
    }
    else {
      newString = "Invalid index";
    }
    System.out.println(newString);
  }
  //toUpperCase()
  
  public String toUpperCase(){
    for(int i=0;i<array1.length;i++){
      char ch=array1[i];
      int a=(int)ch;
      if(a>=97 && a<=122){
        a-=32;
        ch=(char) a;
        array1[i]=ch;
      }
    }
    String newString="";
    for(int i=0;i<array1.length;i++){
      newString+=array1[i];      
    }
    return newString;
  }
  
  //toLowerCase()
  
  public String toLowerCase(){
    for(int i=0;i<array1.length;i++){
      char ch=array1[i];
      int a=(int)ch;
      if(a>=65 && a<=90){
        a+=32;
        ch=(char) a;
        array1[i]=ch;
      }
    }
    String newString="";
    for(int i=0;i<array1.length;i++){
      newString+=array1[i];      
    }
    return newString;
  }
//  equals
  
   public boolean equals(String s){
    char array2[]=s.toCharArray();
    boolean b = false;
    if(array1.length==array2.length){
      for(int i=0;i<array2.length;i++){
        if(array1[i]==array2[i]){
          b=true;
        }
        else{
          b=false;
          break;
        }
      }
    }
    return b;
  }
   
   //equalsIgnoreCase
   
     public boolean equalsIgnoreCase(String s){
    char array2[]=s.toCharArray();
    boolean b = false;
    if(array1.length==array2.length){
      for(int i=0;i<array2.length;i++){
        if(array1[i]==array2[i]||array1[i]==array2[i]+32||array1[i]==array2[i]-32){
          b=true;
        }
        else{
          b=false;
          break;
        }
      }
    }
    return b;
  }
// substring
     public String substring(int num){
    String newString="";
    if(num>=0&&num<array1.length){
      for(int i=num;i<array1.length;i++){
        newString+=array1[i];
      }
    }
    else{
      newString="Invalid index";
    }
    return newString;
  }
//     substring(int , int)
     
  public String subString(int start,int end){
    String newString="";
    if(start>=0&&start<end&&end<array1.length){
      for(int i=start;i<end;i++){
        newString+=array1[i];
      }
    }
    else{
      newString="Invalid index";
    }
    return newString;
  }
  //indexOf
  
  public int indexOf(char ch){
    int ich=(int) ch;
    int index=0;
    for(int i=0;i<array1.length;i++){
      int jch=(int)array1[i];
      if(jch==ich){
        index=i;
        i=array1.length-1;
      }
      else{
        index=-1;
      }
    }
    return index;
  }
  
  
//lastIndexOf
  
  public int lastIndexOf(char ch){
    int ich=(int) ch;
    int index=-1;
    for(int i=array1.length-1;i>=0;i--){
      int jch=(int)array1[i];
      if(jch==ich){
        index=i;
        i=1;
      }
    }
    return index;
  }
  
  //indexOf(char , char)
  
  public int indexOf(char ch, int n){
    int ich=(int) ch;
    int index=-1;
    if(n<array1.length && n>=0){
      for(int i=n+1;i<array1.length;i++){
        int jch=(int)array1[i];
        if(jch==ich){
          index=i;
          i=array1.length-1;
        }
      }
    }
    return index;
  }
  //lastIndexOf(char, char)
  
    public int lastIndexOf(char ch, int n){
    int ich=(int) ch;
    int index=-1;
    if(n<array1.length && n>=0){
      for(int i=array1.length-1;i>n;i--){
        int jch=(int)array1[i];
        if(jch==ich){
          index=i;
          i=n;
        }
      }
    }
    return index;
  }
    
    //concat
    
  public void concat(String s){
    char d[]=s.toCharArray();
    String newString="";
    for(int i=0;i<array1.length;i++){
      System.out.print(newString+array1[i]);
    }
    for(int i=0;i<d.length;i++){
      System.out.print(newString+d[i]);
    }
    System.out.println();
  }
}

