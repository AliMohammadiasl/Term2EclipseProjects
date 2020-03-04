
public class Tuna extends Cold {
	protected boolean hasPickles;
	protected boolean isSpicy;
	 public Tuna(){
		 hasPickles = true;
		 isSpicy    = false;
	 }
	 public Tuna(boolean Pickles, boolean Spicy){
			this();
			this.isSpicy    = Spicy;
			this.hasPickles = Pickles;
		}
	public boolean isHasPickles() {
		return hasPickles;
	}
	public void setHasPickles(boolean hasPickles) {
		this.hasPickles = hasPickles;
	}
	public boolean isSpicy() {
		return isSpicy;
	}
	public void setSpicy(boolean isSpicy) {
		this.isSpicy = isSpicy;
	}
	 
}
