
/*  Name Block:
 *  Lab Number: Lab 2
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

/*
 *  Things changed: Added abstract methods for objects so we can use them in this class and 
 *  Call them.
 */
 
import java.util.Scanner;

public class Main extends Currency{
	
	// Reference 1 Pound Object, Reference 2 Dollar Object
	Dollar dollar = new Dollar();
	Pound pound = new Pound();
	// Array of Two Currency References
	Currency[] currencyObjects = {dollar,pound};
	// Boolean to help with do while loop
        boolean isOn = true;
        // double for our error handling
        double value = 0.00;
	// Our main method
	public static void main(String[] args) {
		Main max = new Main();
	}
	
	// User Interaction called for main 
	public Main() {
		userInteraction();
	}
	
	// Method for User Interface
	public void userInteraction() {
		System.out.println("Welcome to Currency Simulator:");
		System.out.println("Enter a or s to add or subtract d or p to dollar or pound the value you would like to deposite, the name of the currency");
		System.out.println("Example: a d 2.00 dollar -> add 2.00 dollars to dollar balance");
		dollar.print();
		pound.print();
		// do while loop that checks if isOn = false
		do{
		Scanner sc = new Scanner(System.in);
		String ops = sc.next();
		String type = sc.next();
		try {
	    value = sc.nextDouble();
		}catch(Exception typeMismatch) {
			System.out.println("Only numbers with decimals can go in for value");
		}
		String typecheck = sc.next();
	   
	    // checks for input
		if (ops.equals("a")) {
			if (type.equals("d") && typecheck.equals("dollar")) {
			Dollar temp = new Dollar(value);
			currencyObjects[0] = dollar.add((Dollar)currencyObjects[0], temp); 
			((Dollar)currencyObjects[0]).print(); 
			((Pound)currencyObjects[1]).print();
			System.out.println("What would you like to do next? if not type q for letter spaces and 0.00 for currency followed by q");
			}
			
			else if (type.equals("p") && typecheck.equals("pound")) {
				Pound temp = new Pound(value); 
				currencyObjects[1] = pound.add((Pound) currencyObjects[1], temp); //
				((Dollar)currencyObjects[0]).print();
				((Pound)currencyObjects[1]).print();
				System.out.println("What would you like to do next? if not type q for letter spaces and 0.00 for currency followed by q");
			}
			else {
				System.out.println("Incorrect operation!");
			}
		}
		
		// checks for input
		if (ops.equals("s")) {
			if (type.equals("d") && typecheck.equals("dollar")) {
				Dollar temp = new Dollar(value);
				currencyObjects[0] = dollar.subtract((Dollar)currencyObjects[0], temp);
				((Dollar)currencyObjects[0]).print();
				((Pound)currencyObjects[1]).print();
				System.out.println("What would you like to do next? if not type q for letter spaces and 0.00 for currency followed by q");
			}
			else if (type.equals("p") && typecheck.equals("pound")) {
				Pound temp = new Pound(value);
				currencyObjects[1] = pound.subtract((Pound) currencyObjects[1], temp);
				((Dollar)currencyObjects[0]).print();
				((Pound)currencyObjects[1]).print();
				System.out.println("What would you like to do next? if not type q for letter spaces and 0.00 for currency followed by q");
					
			}
			else {
				System.out.println("Incorrect operation!");
			}
		}
		
		if (ops.equals("q")) {
			isOn = false;
		}
		
		}while(isOn == true);
			return;
 }
	@Override
	protected lab2.Currency Currency(lab2.Currency x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected lab2.Currency Pound(lab2.Currency a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected lab2.Currency Dollar(lab2.Currency a) {
		// TODO Auto-generated method stub
		return null;
	}
}
}
//Make currency take one object, dont have a + b in add method, dont have a copy object, add on object return void and on parameter currency. No point in creating method that makes new object, extra work on add check if a and b move from main to add to check type(becasue of currency declare one abstract method. Getter. ABstract public string get name; print all in currency class not dollar and pound. Java lets you take passed object b.get class super.get class. (verify they are the same). first does things together makes base class abstract. properly overridden for children class and second options work. 3 and 4 make object check if second and ffourth object match operation a p obj xxx call array 0.operation if type xxx meets type 0;
//slides have exactly data = object(Currency reference) node reference to next node think of all students in same line, and poiint to person to right theres the node.

// Types of exceptions we need
// Array Out of Bounds
// Arethmetic
// Type protection 
// ArrayStoreException
// Maybe Instantiation Exception
// Invalid cast

