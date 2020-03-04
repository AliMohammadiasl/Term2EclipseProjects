
public class Frozen extends Sandwich{
	protected int temp;
	protected boolean isMelting;
	
	public Frozen(){
		temp = 110;
		isMelting = false;
	}
	public Frozen(int temp, boolean isMelting){
		this();
		this.temp = temp;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public boolean isMelting() {
		return isMelting;
	}
	public void setMelting(boolean isMelting) {
		this.isMelting = isMelting;
	}
	
}
