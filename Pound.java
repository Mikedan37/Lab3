/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

//public class Pound extends Currency{
//	private String currencyName;
//	private String coinName;
//	
//	public Pound() {
//		super();
//		this.currencyName = "Pound";
//		this.coinName = "Cent";
//	}
//	
//	public Pound(int noteValue,int coinValue) {
//		super(noteValue, coinValue);
//		this.currencyName = "Pound";
//		this.coinName = "Cent";
//	}
//	
//	@Override
//	public Currency add(Currency currency) {
//		Pound other = (Pound) currency;
//		int notes = super.getNoteValue() + other.getCoinValue();
//		int coins = super.getCoinValue() + other.getCoinValue();
//		if(coins >= 100) {
//			notes++ ;
//			coins -= 100;
//		}
//		return new Pound(notes,coins);
//	}
//	@Override
//	public Currency subtract(Currency currency) {
//		Pound other = (Pound) currency;
//		int notes = super.getNoteValue() - other.getNoteValue();
//		int coins = super.getCoinValue() - other.getNoteValue();
//		if(coins < 0) {
//			notes--;
//			coins += 100;
//		}
//		return new Dollar(noteValue,coinValue);
//	}
//
//	@Override
//	public int compare(Currency currency) {
//		Pound other = (Pound) currency;
//		if(this.getNoteValue() > other.getNoteValue()) {
//			return 1;
//		}else if(this.getNoteValue() < other.getNoteValue()) {
//			return -1;
//		}else if(this.getCoinValue() > other.getCoinValue()) {
//			return 1;
//		}else if(this.getCoinValue() < other.getCoinValue()) {
//			return -1;
//		} else {
//			return 0;
//		}
//		
//	}
//
//	@Override
//	public String printCurrency() {
//		String str = new String();
//		if(super.getCoinValue() > 10) {
//			str = super.getNoteValue() + " " + currencyName + " " + super.getCoinValue() + " " + coinName;
//		}else {
//			str = super.getNoteValue() + ".0" + currencyName + " " + super.getCoinValue() + " " + coinName;
//		}	
//	    return str;
//	}
//
//}

