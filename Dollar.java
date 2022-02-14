/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

public class Dollar extends Currency {
// Non public String Attribute which contains name of Dollar 
private String type = "Dollar";
	
	//Dont need pre or post documentation for constructors or destructors
	public Dollar() {
		super();
	}
	
	public Dollar(double z) {
		super(z);
	}
	
	public Dollar(Dollar x) {
		this.setUnit(x.getUnit());
		this.setFraction(x.getFraction());
	}
	
	/*
	 * The purpose of these two methods is to be a getter for the String attribute of this class
	 * Pre: No input
	 * Post: returns type variable with name of dollar
	 */
	
	public String getType() {
		return type;
	}
	
	/*
	 * The purpose of this method is to add the fractional and unit values inside two dollar objects together
	 * Pre: Dollar a,b - two objects of type Dollar
	 * Post: returns Dollar object x
	 */
	 
	public Dollar add(Dollar a, Dollar b) {
		Dollar x = new Dollar(((a.getUnit()+b.getUnit())*100+a.getFraction()+b.getFraction())/100.0);
		return x;
	}
	
	/* Algorithm subtract(Dollar object a, Dollar object b)
	 * 
	 * The purpose of this method is to subtract the fractional and unit values inside two currency objects together
	 * Pre: Dollar x,y - two objects of type Dollar
	 * 		One - combines unit and fraction attributes of first object to a single double
	 *      Two - combines unit and fraction attributes of sexond object to a single double
	 * Post: returns Dollar object
	 * 
	 * if( one is greater than or equal to two )
	 * 	 Dollar object x equals a new dollar object calculated by the difference between one and two
	 * 		return Dollar object x
	 * else 
	 *   Print an error message because dollar cannot be negative
	 *   Dollar object x equals origonal dollar object a
	 *   return Doller objext x
	 */
	
	public Dollar subtract(Dollar a, Dollar b) {
		double one = a.getUnit()+a.getFraction()/100;
		double two = b.getUnit()+b.getFraction()/100;
		if (one>=two) {
			Dollar x = new Dollar(one-two);
			return x;
		}else {	
			System.out.println("You cannot be negative!");
			Dollar x = new Dollar(a);
			return x;
		}
	}
	
	/*
	 * Algorithm isEqual(Dollar a, Dollar b)
	 * 
	 * The purpose of this method is to compare if both input objects are equal
	 * Pre: Dollar a,b - two objects of type Dollar
	 * Post: return true or false
	 * 
	 * if(unit value of a is equal to unit value of b and fraction value a is equal to fraction value b)
	 *  return true
	 * end if
	 * return false
	 * 
	 */
	
	public boolean isEqual(Dollar a, Dollar b) {
		if (a.getUnit()==b.getUnit()&&a.getFraction()==b.getFraction()) {
			return true;
		}
		return false;
	}
	
	/*
	 * Algorithm isGreater(Dollar a, Dollar b)
	 * 
	 * The purpose of this method is to compare which input object of the same currency is greater
	 * Pre: Dollar a,b - two objects of type Dollar
	 * Post: return object a or b
	 * 
	 * if(unit value of a is greater to unit value of b and fraction value a is greater to fraction value b)
	 *  return a
	 * end if
	 *  return b
	 * 
	 */
	
	public Dollar isGreater(Dollar a, Dollar b) {
		if (a.getUnit()>b.getUnit()||a.getUnit()>=b.getUnit()&&a.getFraction()>b.getFraction()) {
			return a;
		}
		return b;
	}
	
	/*
     * The purpose of this method is to print out the name and components of the currency
     * Pre: No input
     * Post: prints unit and fractional values of Dollar object and name dollar
     */
	
	public void print() {
		System.out.println(this.getUnit()+"."+this.getFraction()+" "+ type);
	}	
}
