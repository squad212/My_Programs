package Day17InterfaceAndAbstract;

public class InterfaceTest {

	public static void main(String[] args) {
		int a = 323;
		int b = 15;
		int c = 22;
		int d = 11;
// ICar - Start, Stop, Drive
// Honda - start, drive,stop,make Turn,takeReverse
// HondaAccord - start, drive,stop,make Turn,takeReverse	
//IMusic- AMusic
	
	//rhs can be sub class or child of lhs
	//rhs can be same as lsh
	//rhs should always be concrete program
	
	ICar i = new HondaAccord();
	Honda h = new HondaAccord();
	HondaAccord ha = new HondaAccord();
	System.out.println(ha.a);
	System.out.println(ha.b);
	System.out.println(ha.c);
	System.out.println(ha.d);
	ha.takeReverse(); //constructor call
	h.makeTurn();
	}

}
