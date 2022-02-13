/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

public class Queue extends SingleLinkedList{
	
	public Queue() {
		super();
	}
	
	public void enqueue(LinkNode nd) {
		super.add(nd);
	}
	
	public void dequeue() {
		super.delete(super.head);
	}
	
	public LinkNode peekFront(){
		if(super.length() == 0){
			System.out.println("The queue is empty"); System.exit(1);
		}	
			return super.head;	
	}
	
	public LinkNode peekRear() {
		if(super.length() == 0){
			System.out.println("The queue is empty"); System.exit(1);
		}
			return super.end;
		}
}

