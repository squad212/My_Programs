package Day19Static;

public class Test {

	public static void main(String[] args) {
		//create a reference of two customer 
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		c1.address= "11 locust st"; c1.name = "sam"; c1.point=123;
		c2.address= "11 locust st"; c2.name = "don"; c2.point=170;
		
		System.out.println(c1.address + ":" + c1.name + ":" + c1.point);
		System.out.println(c2.address + ":" + c2.name + ":" + c2.point);
		
		c1.name = "ram";
		System.out.println(c1.address + ":" + c1.name + ":" + c1.point);
		System.out.println(c2.address + ":" + c2.name + ":" + c2.point);
		c2.address = "1432 Locust st";
		System.out.println(c1.address);
		System.out.println(c2.address);
	}
	
		

}
