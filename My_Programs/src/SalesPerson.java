
public class SalesPerson {

	public static void main(String[] args) {
		//if you need to access the Vehicle variable name
		// 1. create the reference for a Vehicle class
		//2. using the reference and dot operator 
		Vehicle v = new Vehicle();
		System.out.println(v.name);
		System.out.println(v.wheel);
		System.out.println(v.color);
		
		Calculator c = new Calculator();
		System.out.println(c.name);
		
	}
}
