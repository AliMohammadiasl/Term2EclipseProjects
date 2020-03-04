
public class Hot extends Sandwich {
	protected boolean Toasted;
	protected boolean butteredBread;
	 
	public Hot(){
		Toasted = true;
		butteredBread = true;
	}
	public Hot(boolean T, boolean B){
		this();
		this.Toasted  = T;
		this.butteredBread = B;
	}
	public boolean isToasted() {
		return Toasted;
	}
	public void setToasted(boolean toasted) {
		Toasted = toasted;
	}
	public boolean isButteredBread() {
		return butteredBread;
	}
	public void setButteredBread(boolean butteredBread) {
		this.butteredBread = butteredBread;
	}
	
}
