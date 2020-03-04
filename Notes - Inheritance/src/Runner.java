
public class Runner {

	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Animal(1.0);
		
		System.out.println(a); //invokes the toString method
		System.out.println(b); //calls toString! :)
		
		Human Kobe = new Human();
		
		Animal z = new Human(); //is-a check passes R-t-L
		System.out.println(z.warriorCry());
		
		
		
	}

}
