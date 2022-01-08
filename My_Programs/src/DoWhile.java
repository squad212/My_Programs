import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		boolean doExit=true;
		while (doExit)
		{Scanner sc = new Scanner(System.in);
			System.out.println("enter 1 to sub, 2 to exit");
		int option = sc.nextInt(); //here the program will halt and wait for programmer to input the number
		if(option==1) {
			System.out.println("enter 1st number");
			int number1 =sc.nextInt(); //halt and wait for the input
			System.out.println("enter 2nd number");
			int number2 =sc.nextInt(); //halt and wait for the input
			int sub = number1 - number2;
			System.out.println("sub is :" + sub);

			}
		else if (option == 2)
			break;
	}
	}
	
}
