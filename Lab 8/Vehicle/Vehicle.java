public class Vehicle{
  public int x =0;
  public int y =0;
  public Vehicle(){
    
  }
  public void  moveUp(){
    y++;
  }
  public void  moveDown(){
    y--;
  }
  public void  moveRight(){
    x++;
  }
  public void  moveLeft(){
    x--;
  }
  public String toString(){
    return "("+x+"," +y+")";
  }
}