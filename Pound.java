/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

public class Pound extends Currency{
// Non public String Attribute which contains name of Pound 
private String type = "Pound";
	
    //Dont need pre or post documentation for constructors or destructors
	public Pound() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Pound(double z) {
		super(z);
	}
	
	public Pound(Pound x) {
		this.setUnit(x.getUnit());
		this.setFraction(x.getFraction());
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
	 * The purpose of this method is to add the fractional and unit values inside two pound objects together
	 * Pre: pound a,b - two objects of type pound
	 * Post: returns Pound object x
	 */
	 
	public Pound add(Pound a, Pound b) {
		Pound x = new Pound(((a.getUnit()+b.getUnit())*100+a.getFraction()+b.getFraction())/100.0);
		return x;
	}
	
	/* Algorithm subtract(Pound object a, Pound object b)
	 * 
	 * The purpose of this method is to subtract the fractional and unit values inside two currency objects together
	 * Pre: Pound a,b - two objects of type Dollar
	 * 		One - combines unit and fraction attributes of first object to a single double
	 *      Two - combines unit and fraction attributes of sexond object to a single double
	 * Post: returns Pound object
	 * 
	 * if( one is greater than or equal to two )
	 * 	 Pound object x equals a new pound object calculated by the difference between one and two
	 * 		return Pound object x
	 * else 
	 *   Print an error message because pound cannot be negative
	 *   Pound object x equals origonal pound object a
	 *   return Pound objext x
	 */
	
	public Pound subtract(Pound a, Pound b) {
		double one = a.getUnit()+a.getFraction()/100;
		double two = b.getUnit()+b.getFraction()/100;
		if (one>=two) {
			Pound x = new Pound(one-two);
			return x;
		}
		else {
			System.out.println("No Negative Values Allowed!");
			Pound x = new Pound(a);
			return x;
		}
	}
	
	/*
	 * Algorithm isEqual(Pound a, Pound b)
	 * 
	 * The purpose of this method is to compare if both input objects are equal
	 * Pre: Pound a,b - two objects of type Pound
	 * Post: return true or false
	 * 
	 * if(unit value of a is equal to unit value of b and fraction value a is equal to fraction value b)
	 *  return true
	 * end if
	 * return false
	 * 
	 */
	
	public boolean isEqual(Pound a, Pound b) {
		if (a.getUnit()==b.getUnit()&&a.getFraction()==b.getFraction()) {
			return true;
		}
		return false;
	}
	
	/*
	 * Algorithm isGreater(Dollar a, Dollar b)
	 * 
	 * The purpose of this method is to compare which input object of type pound is greater
	 * Pre: Pound a,b - two objects of type Pound
	 * Post: return object a or b
	 * 
	 * if(unit value of a is greater to unit value of b and fraction value a is greater to fraction value b)
	 *  return a
	 * end if
	 *  return b
	 * 
	 */
	
	public Pound isGreater(Pound a, Pound b) {
		if (a.getUnit()>b.getUnit()||a.getUnit()>=b.getUnit()&&a.getFraction()>b.getFraction()) {
			return a;
		}
		return b;
	}
	
	/*
     * The purpose of this method is to print out the name and components of the currency
     * Pre: No input
     * Post: prints unit and fractional values of Pound object and name pound
     */
	
	public void print() {
		System.out.println(this.getUnit()+"."+this.getFraction()+" "+ type);
	}
}
