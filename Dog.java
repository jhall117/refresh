public class Dog extends Animal{
    String name;
    int weight;
    
    public Dog(String name, int weight, int numLegs, String sound){
        super(numLegs,sound);
        this.name = name;
        this.weight = weight;
    }
    
    public void printName(){
        System.out.println("Name: " + name);
    }
    
    public void printWeight(){
        System.out.println("Weight: " + weight);
    }
}