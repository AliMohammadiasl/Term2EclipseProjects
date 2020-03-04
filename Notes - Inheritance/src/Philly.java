
public class Philly extends Hot {
	protected boolean hasPeppers;
	protected String cheese;
	public Philly(){
		hasPeppers = true;
		cheese = "American";
	
	}
	public Philly(boolean P, String C){
		this();
		this.cheese = C;
		this.hasPeppers = P;
	}
	public boolean isHasPeppers() {
		return hasPeppers;
	}
	public void setHasPeppers(boolean hasPeppers) {
		this.hasPeppers = hasPeppers;
	}
	public String getCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	
}
