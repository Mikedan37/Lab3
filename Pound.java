
/*   
 *  Name Block:
 *  Lab Number: Lab 2
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

/*
 *  Things that were changed: Add, Subtract, IsGreater, IsEqual, method was removed an only in Currency class to utalize,
 *  and display polymorphism. Creatend empty abstract Methods
 */

public class Pound extends Currency{
// Non public String Attribute which contains name of Pound 
private String type = "Pound";
	
    //Dont need pre or post documentation for constructors or destructors
	public Pound(double d) {
	// TODO Auto-generated constructor stub
	}
	
	public Pound() {
	// Auto generated	
	}

	/*
	 * The purpose of these two methods is to be a getter for the String attribute of this class
	 * Pre: No input
	 * Post: returns type variable with name of pound
	 */
	
	public String getType() {
		return type;
	}
	
	/*
         * The purpose of this method is to print out the name and components of the currency
         * Pre: No input
         * Post: prints unit and fractional values of Pound object and name pound
         */
	
	public void print() {
		System.out.print(this.getUnit()+"."+this.getFraction()+" "+ type + "\n");
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
