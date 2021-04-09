public class Calculator {
	// datatype variable_name = value
	//INITIALIZATION is a process where you provide a value for the first time. eg. when we purchase the car the speedometer is 0
	 	//set a value for the first time. changes from 0 to 1, 2 and so on...
	
	String name = "casio";
	// DECLARATION
	int a;
	public int sub (int a, float b){
		//options for return statement
		//1. return LITERAL value of type int(number)
		//2. return a variable of same type
		return 1;
	}
//parameter =input/information holder
	public float mul ( int a, float b, boolean c){
		System.out.println(a);
		int p = 10;
		float q = 15.0f;
		boolean r = true;
		return 1.0f;
	}
	//method declaration
	public int add(int a, int b) {
		// a has 10 , b has 15
			//RHS process first
//output of RHS is given/assigned to LHS
		int sum = a + b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(sum);
		return sum;
	}
		public void temp() {
		name = "casio"; //reassigning 
		System.out.println(name);
		
		//DECLARATION ----this line is declaration the value of x has a datatype integer. variable x can hold upto 2 billion. 
		int speedometer;
		//INITIALIZATION--assign the value for the first time
		speedometer= 0;
		// REASSIGNMENT --change it again. do something else . process to change the initialization value. 
		speedometer = 200;

	}
}