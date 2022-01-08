package Coke;

import java.util.ArrayList;
import java.util.List;

public class testing {

	public static void main(String[] args) {
		//create a reference 
		//using a reference and dot operator
		
//		CokeDrink c = new CokeDrink();
//		c.size = CokeDrink.CokeDrinkSize.large;
//		System.out.println("size:" + c.size);


		List<String> mylist = new ArrayList<>();
		mylist.add("apple");
		mylist.add("orange");
		mylist.add("grape");
//		for(int i = 0;i<mylist.size()-1;i++){
//			int counter = 0;
//			if(mylist.get(i).equalsIgnoreCase("Apple")){
//				mylist.get(i) == "Bad Apple"; //repllace the value with given value
//				counter++;
//			}
//		}

		//Java 11 stream: How to convert the given for loop in to java 11 stream
		int counter = 0;
		mylist.stream().forEach(fruit-> fruit="bad apple");

	}
 
}