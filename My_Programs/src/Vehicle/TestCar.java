package Vehicle;

import java.util.Scanner;

public class TestCar {
	public static void main(String[] args) {

		
		Cal c = new Cal();
		c.add(10, 20);
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1 for hundai, 2 for ford, 3 for ferrari");
		int option = s.nextInt(); //using reference and asking for input stop.
		
		if (option == 1){
			Hundai h = new Hundai();
			drive(h);
		}
			
		else if (option == 2) {
			Ford fo = new Ford();
			drive(fo);
		}
			else {
			Ferrari f = new Ferrari();
			drive(f);
			}
		
	}

	public static void drive(Car c) {
		c.drive();
		
	}
 
}
