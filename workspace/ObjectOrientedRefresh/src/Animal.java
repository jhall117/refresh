
public class Animal {
	private int num_legs = 0;
	private boolean hungry = false;
	private String size = "";

	public Animal(int in_numLegs, boolean in_hungry, String in_size){
		this.num_legs = in_numLegs;
		this.hungry = in_hungry;
		this.size = in_size;
	}

	public int getNumLegs() {
		return num_legs;
	}
	
	public void setNumLegs(int numLegs) {
		this.num_legs = numLegs;
	}
	
	public boolean isHungry() {
		return hungry;
	}
	
	public void setHungry(boolean hungry){
		this.hungry = hungry;
	}
	
	public void feed() {
		this.hungry = false;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
   

}