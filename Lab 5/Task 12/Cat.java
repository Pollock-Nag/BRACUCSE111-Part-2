public class Cat{ 
    public String color = "White"; 
    public String action = "sitting";
    
    public Cat() {
    }
    public Cat(String color) {
        this.color = color;
    }
    public Cat(String _color, String _action) {
        color = _color;
        action = _action;
    }
    public void changeColor(String c) {
        color = c;
    }
    public void printCat() {
        System.out.println(color+" cat is "+action);
    }
    
    
} 

