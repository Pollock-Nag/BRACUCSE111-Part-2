public class Vehicle2010 extends Vehicle{
  
  public void moveUpperRight(){
    y++;
    x++;
  }
  public void moveUpperLeft(){
    y++;
    x--;
  }
  
  public void moveLowerRight(){
    y--;
    x++;
  }
  
  public void moveLowerLeft(){
    y--;
    x--;
  }
  public boolean equals(Vehicle2010 v){
  return (v.x==this.x  && v.y== this.y);
  }
}