package Class;
// Class Declaration
public class Dog_Example {
    // Instance Variables
    String breed;
    String size;
    int age;
    String color;
    
    public void eat() {
    	
    }

  
    // method 1
    public String getInfo() {
        return ("Breed is: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
    }
    
// try with main method out side the class with different class
    public static void main(String[] args) {
    	Dog_Example maltese = new Dog_Example();
        maltese.breed="Maltese";
        maltese.size="Small";
        maltese.age=2;
        maltese.color="white";
        System.out.println(maltese.getInfo());
    }
}