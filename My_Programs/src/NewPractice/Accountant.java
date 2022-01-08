package NewPractice;

public class Accountant {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(1,2);
		int x = c.add(1, 30);
		System.out.println(x);
	public int add (int a, int b){
		int sum = a + b;
		return sum;
		}
	}


}
