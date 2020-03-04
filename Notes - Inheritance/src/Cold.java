
public class Cold extends Sandwich {
	protected boolean Mayo;
	protected boolean Fresh;
	
	public Cold(){
		Mayo  = true;
		Fresh = true;
	}
	public Cold(boolean Mayo, boolean Fresh){
		this();
		this.Mayo  = Mayo;
		this.Fresh = Fresh;
	}
	public boolean isMayo() {
		return Mayo;
	}
	public void setMayo(boolean mayo) {
		Mayo = mayo;
	}
	public boolean isFresh() {
		return Fresh;
	}
	public void setFresh(boolean fresh) {
		Fresh = fresh;
	}
	
}
