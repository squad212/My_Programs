package Accountant_Calculator;

public class Accountant {

	public static void main(String[] args) {
		//for variable name from Calculator program
		//create a reference
		//using reference and dot operator
		
		Calculator c = new Calculator();
		System.out.println(c.name);
		
		//for method call
		//create a reference
		//using reference and dot operator
		//pass the exact input/number
		//handle the response
		//pass the literal value
		
		int x = c.add(10, 15);
		System.out.println(x);
		float y = c.sub(5, 10.0f);
		System.out.println(y);
		
		
	}

}
