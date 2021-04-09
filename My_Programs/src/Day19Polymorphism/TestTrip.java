package Day19Polymorphism;

import java.util.Scanner;

public class TestTrip {


	public static void main(String[] args) {
		System.out.println("show the calculation");
		Calculation c = new Calculation();
		c.add(2, 5);
		c.add("john", "doe");
		
		Scanner s = new Scanner(System.in);
		System.out.println("press 1 for bike, 2 for car, 3 for flight");
		int option = s.nextInt();
		
		if (option == 1) {
			Bike b=new Bike();
			Fun(b);
		}
		else if (option == 2) {
			Car c1 =new Car();
			Fun(c1);
		}
		else {
			Plane p=new Plane();
			Fun(p);
		}
			
		}

	
	
	public static void Fun(Trip t) {
		t.Fun();
	}

}

