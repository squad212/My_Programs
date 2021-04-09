// Accountant is the caller program of calculator 
public class Accountant {

	public static void main(String[] args) {
		
		
		FacebookCustomer d = new FacebookCustomer();
		System.out.println(d.name);
		
		//if you need to access variable name from
		// calculator program
		// 1.create reference for a calculator program. c is the reference 
		Calculator c = new Calculator();
		
		
		// 2. using the reference and dot operator 
				//read variables 
		System.out.println(c.name);			
		
		//if you need access add method from calculator
		//1. create a reference 
		//2. using the reference and dot operator  add method
		//3. no more, no less, no different. must have exact number or exact match of inputs
		//4. handle the response
		//method call
		//PASS input 10 and 34.05
		int a =c.sub(10,15.0f);
		//PASS VARIABLE
		int p = 543;
		float q = 15.0f;
		boolean r = true;

		float b=c.mul(p,q,r);
		System.out.println(a);
		System.out.println(b);
		
		int x = c.add(10,15);
		System.out.println(x);
		//method call
		
	}
	//for accessing the method form another program 
	//using the reference and dot operator and adding the input from ();
	//handle the response
	//int x=c.add(10,15);

	
	
}
