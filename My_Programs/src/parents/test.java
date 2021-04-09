package parents;

public class test {

	public static void main(String[] args) {
		// create a reference
		//using a reference and dot operator
		
		Client c = new Client(); //c is a reference variable of client class/program
		Client c1 = new Client();
		//when it says new now object is created
		
		Parent p = new Parent(); //allocate address in memory
		//
		p.print(c.dad, c.mom, c.son, c.age);
		
		System.out.println(c.dad);
	}

}
