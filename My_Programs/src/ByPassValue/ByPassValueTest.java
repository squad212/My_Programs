package ByPassValue;

public class ByPassValueTest {

	public static void main(String[] args) {
		//create a reference for passing the variable of another porgram
		//using reference and dot operator
		
		StudentClass s = new StudentClass();
		ByPassValue1 b1 = new ByPassValue1();
		System.out.println(s.firstName);
		int b = 10;
		boolean result = b1.test(b, s);
		System.out.println(b);
		System.out.println(s);
		
		//s reference will pass the the value of #123 addresss reference of studentclass
		System.out.println(s.firstName);
		System.out.println(s.lastName);
		System.out.println(b);
		System.out.println(s.firstName);
		System.out.println(s.age);
		System.out.println(s.grade);
		
		
		

	}

}
