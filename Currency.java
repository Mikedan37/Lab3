/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

public abstract class Currency {
	
protected int noteValue, coinValue;

public Currency() {
	this.noteValue = 0;
	this.coinValue = 0;
}

public Currency(int noteValue, int coinValue) {
	this.noteValue = noteValue;
	this.coinValue = coinValue;
}

public Currency(Currency currency) {
	this.noteValue = currency.noteValue;
	this.coinValue = currency.coinValue;
}

public int getNoteValue() {
	return noteValue;
}

public void setNoteValue(int noteValue) {
	this.noteValue = noteValue;
}

public int getCoinValue() {
	return coinValue;
}

public void setCoinValue(int coinValue) {
	this.coinValue = coinValue;
}

public abstract Currency add(Currency c);
public abstract Currency subtract(Currency c);
// Greater than or equal
public abstract int compare(Currency c);
public abstract String printCurrency();

}

