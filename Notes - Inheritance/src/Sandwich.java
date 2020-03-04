
public class Sandwich {
	protected boolean vegan;
	protected String BreadType;
	public Sandwich(){
		vegan     = false;
		BreadType = "wheat";
	}
	public Sandwich(boolean vegan, String BreadType){
		this();
		this.vegan = vegan;
		this.BreadType = BreadType;
	}
	public boolean isVegan() {
		return vegan;
	}
	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}
	public String getBreadType() {
		return BreadType;
	}
	public void setBreadType(String breadType) {
		BreadType = breadType;
	}
	
}
