package lab3;
/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */
abstract class LinkNode extends Currency {
	Currency data;
	LinkNode next;
	
	private LinkNode(Currency data) {
		this.data = data;
		this.next = null;
	}
	
}
