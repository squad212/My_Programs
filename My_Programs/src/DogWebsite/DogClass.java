package DogWebsite;

public class DogClass {
	String	name = "Brutin";
	String	breed = "MiniAussie";
	byte	legs = 4;
	String	color = "Black and White";
	String	age = "8 months";
	
	public static void main (String [] args) {
	System.out.println();
	
	// create a reference for the SignupClass
		// used reference and dot reference for variable name
		SignupClass sig = new SignupClass();
		System.out.println(sig.firstName);
		System.out.println(sig.lastName);
		System.out.println(sig.phoneNumber);
		System.out.println(sig.create);
	
		LoginClass l = new LoginClass();
		System.out.println(l.userName);
		System.out.println(l.password);
		
		
		AddressClass a = new AddressClass();
		System.out.println(a.streetName);
		System.out.println(a.city);
		System.out.println(a.state);
		System.out.println(a.zipCode);
		System.out.println(a.country);
		
	}
}
