package returnstatement;

public class test {

	public static void main(String[] args) {
		
		
		//create the reference 
		//using the reference and dot operator
		
		ReturnType r = new ReturnType();
		
		//method call
		//create a reference
		//using a reference and dot operator
		//pass exact number or input
		//pass the response
		
	float x = r.simpleInterest(1000, 12, 5);
	System.out.println(x);
	boolean y = r.withdraw1(5);
	System.out.println(y);
	int z = r.add(10,15);
	System.out.println(z);
	boolean a =r.passwordChange("email the reset code", "Creat a new password");
	System.out.println(a);
	}

}
