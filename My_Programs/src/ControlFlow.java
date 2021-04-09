import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		int pinInRecord = 1243;
		int userPin = 1244;
		boolean abc = false;
		//we use the if loop first 
		if (pinInRecord==userPin)
		{
			System.out.println("customer pin-success");
			System.out.println("withdraw/depost amount");
		}
		
		else 
				System.out.println("invalid pin-decline");
		
		
			
		System.out.println("a and b are same here");
		System.out.println("press 1 to withdraw, press 2 to deposit, press 3 to exit ");
		int option = 2;
		if (option == 1)
		{
			System.out.println("enter withdraw amount" );
		}
		else if (option == 2)
		{System.out.println("enter deposit amount");
		
		}
		else
		{
			System.out.println("thank you");
		for(int i=1; i<=4 ; i++) {
				System.out.println("hi");
				if( i==1 )
					continue;
				else if ( i==3 )
					break;
				System.out.println("bye");
		
	
			
			
	
			}
		
		
		}

	}
 
}
