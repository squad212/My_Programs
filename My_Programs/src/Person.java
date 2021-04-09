
public class Person {
	public int Trip() {
		System.out.println("a");
		Drive();
		System.out.println("x");
		return 1;
	}
	public int Drive() {
		System.out.println("b");
		UnlimitedFun(); //again it resumes here and print "y"
		System.out.println("y");
		return 2;
	}
	public int UnlimitedFun() {
		System.out.println("c");
		System.out.println("z");
		int m = 3;
		return m;
	}

}
