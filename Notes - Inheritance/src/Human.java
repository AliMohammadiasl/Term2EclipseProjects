
public class Human extends Animal {

	private boolean isKobe;
	private int height; //in inches
	
	public Human(){
		isKobe   = false;
		height   = 67;
		isMammal = true;
		weight   = 190/2.2;
		isAlive = true;
	}
	public String warriorCry(){
		return "Stay Classy";
	}

	public boolean isKobe() {
		return isKobe;
	}

	public void setKobe(boolean isKobe) {
		this.isKobe = isKobe;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
