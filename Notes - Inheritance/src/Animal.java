
public class Animal {
	// protected allows all related classes
	// direct access to the instance variable
	protected boolean isAlive;
	protected double weight; //kg
	protected boolean isMammal;
	
	public Animal(){
		isAlive  = true;
		weight   = 30;
		isMammal = false;
	}
	public String warriorCry(){
		return"Wheeee";
	}
	
	//add a 2nd constructor allowing setting of the weight
	//during construction
	public Animal(double weight){
		this();
		this.weight = weight;
	}
	
	public String toString(){
		return "weight : " + weight;
	}
	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isMammal() {
		return isMammal;
	}

	public void setMammal(boolean isMammal) {
		this.isMammal = isMammal;
	}
	
}
