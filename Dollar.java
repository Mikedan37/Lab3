
/*   
 *  Name Block:
 *  Lab Number: Lab 2
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

public class Dollar extends Currency {
// Non public String Attribute which contains name of Dollar 
private String type = "Dollar";
	
	//Dont need pre or post documentation for constructors or destructors
	public Dollar(double d) {
	// Auto generated
	}
	
	public Dollar() {
	// Auto generated	
	}
	
	// String attribute method
	public String getType() {
		return type;
	}
	
	/*
         * The purpose of this method is to print out the name and components of the currency
         * Pre: No input
         * Post: prints unit and fractional values of Dollar object and name dollar
         */
	
	public void print() {
		System.out.print(this.getUnit()+"."+this.getFraction()+" "+ type + " ");
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
