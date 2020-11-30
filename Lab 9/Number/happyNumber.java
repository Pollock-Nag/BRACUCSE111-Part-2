public class happyNumber{
  public boolean hN(int n){
    int num=n;
    int rest=0;
    int sum=0;
    while (num!=1 && num!=4){
      sum=0;
                    while(num>0){
                     rest= num%10;
                      sum=(int)(sum+Math.pow(rest,2));
                         num=num/10;
                            }
                     num=sum;
    }
    if(num==1)
    return true;
      else 
        return false;
  }
}
  