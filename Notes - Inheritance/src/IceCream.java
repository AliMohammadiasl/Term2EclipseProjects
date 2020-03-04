
public class IceCream extends Frozen {
	private boolean vanilla;
	private boolean chocolate;
	public IceCream(){
		vanilla = false;
		chocolate = true;
	}
	public IceCream(boolean vanilla, boolean chocolate){
		this();
		this.vanilla = vanilla;
		this.chocolate = chocolate;
	}
	public boolean isVanilla() {
		return vanilla;
	}
	public void setVanilla(boolean vanilla) {
		this.vanilla = vanilla;
	}
	public boolean isChocolate() {
		return chocolate;
	}
	public void setChocolate(boolean chocolate) {
		this.chocolate = chocolate;
	}
	
}
