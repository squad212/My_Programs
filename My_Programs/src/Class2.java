//java program by default are sequential 
public class Class2 {

	public static void main(String[] args) {
		System.out.println("suvu");
	//create a reference
	//using a reference and dot operator
		//for variable name of Class1 program but it has no name
	Class1 c = new Class1();
		//for call in method
		//create a reference
		//using a reference and dot operator
		//pass exact input/number
		//handle the response
		int x = c.addition();//method call jumps to the method's program
		//pause the current program
		//control jumps to Class1 program additional method
		//resume
		System.out.println("rupesh"); 
		int y = c.subtraction();
		//pause, give control to subtraction method
				//control jumps to Class1 program to subtraction method
				//resume
		System.out.println("suhit");
		int z = c.multiply();//pause , give control to multiply method
		//control jumps to Class1 program to multiply method
		//resume
		System.out.println("amit");
	}

}
