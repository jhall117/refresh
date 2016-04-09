public class Animal{
    int numLegs = 0;
    String sound;
    
    public Animal(int numLegs, String sound){
        this.numLegs = numLegs;
        this.sound = sound;
    }
    
    public void speak(){
        System.out.println(sound);
    }
}