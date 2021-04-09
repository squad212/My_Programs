package GroceryStore;


public class OnlineGroceryStore {
	
	public static void main (String [] args) {
		

	String name = "I-30 FastMart"; 
	AddressClass  address;
	EmployeesClass Employees;
	FoodClass Foods;
	CustomersClass Customers; //customerclass 
	long phoneNumber;
	//creat a reference
	//use dot operator
	
	AddressClass fullAddress = new AddressClass();
	System.out.println(fullAddress.streetName);
	System.out.println(fullAddress.city_state);
	System.out.println(fullAddress.zipCode);
	System.out.println(fullAddress.County);
	System.out.println(name);
	
	// create a reference
	//using a reference and dot operator
	//variable name
	CustomersClass c = new CustomersClass();
	System.out.println(c.age);
	
	
	//method call
	float x =c.bonusPoint(10, 2.99f);
	System.out.println(x);
	
	}
}