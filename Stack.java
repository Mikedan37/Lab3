/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

public class Stack extends SingleLinkedList{
	public Stack() {
		super();
	}
	
	public void push(LinkNode nd) {
		super.add(nd);
	}
	
	public void pop() {
		super.delete(super.end);
	}
	
	public int size() {
		return super.count;
	}
	
	public LinkNode peak(){
		return super.end;
	}
}
