public class Dog { 
    private String color = "Black"; 
    public Dog(String c) {
        color = c;
    }
    public void bark() {
        System.out.println(color+" dog is barking");
    }
    public void changeColor(String c) {
        color = c;
    }
    
}