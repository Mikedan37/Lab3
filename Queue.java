/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */
public class Queue extends SinglyLinkedList {

	// Dont need pre or post documentation for Constructors
	public Queue() {
		super();
	}
	
	/*
	 * The purpose of this method is to add the currency object to the queue
	 * Pre: Currency - Object of type currency
	 * 		LinkNode - Linknode object with its index
	 * Post: Adds the currency at the end of the que calling addCurrency method from SinglyLinkedList parent
	 */
	
	public void enqueue(Currency currency, LinkNode index) {
		super.addCurreny(currency, super.getEnd());
	}
	
	
	/* The purpose of this method is to Remove a currency object from front of the queue
	 * Pre: No input
	 * Post: Removes the currency object from the beginning of the queue calling the removeCurrency method from SinglyLinkedList parent
	 */
	
	public void dequeue() {
		super.removeCurrency(super.getStart());
	}
	
	/* Algorithm peekFront
	 * 
	 * The purpose of this Method is to let us see which Currency object in the front of top of the queue
	 * Pre: No input
	 * Post: Returns the front Currency object in the queue
	 * 
	 * if(the que length is equal to zero)
	 * 	print the que is empty
	 * else
	 * 	return the queues first Currency object
	 */
	
	public Currency peekFront(){
		if(super.getCount() == 0) {
			System.out.println("Empty Queue");
		}
		   return super.getStart().data;
	}
	
	/* Algorithm peekRear
	 * 
	 * The purpose of this Method is to let us see which Currency object in the back of the queue
	 * Pre: No input
	 * Post: Returns the front Currency object in the queue
	 * 
	 * if(the que length is equal to zero)
	 * 	print the que is empty
	 * else
	 * 	return the queues last Currency object
	 */
	
	public Currency peekRear(){
		if(super.getCount() == 0) {
			System.out.println("Empty Queue");
		}
		return super.getEnd().data;
	}
	
	/* Algorithm printQueue
	 * 
	 * The purpose of this Method is to return a string that has a collection of all the que objects in order
	 * Pre:
	 * Post:
	 * 
	 * while(next node equals null)
	 * 
	 * add currency object plus a space to full variable
	 * sets the Queue pointer to the next currency object in queque
	 * 
	 * end while
	 * 
	 * return full
	 */
	
	public String printQueue() {
		Queue temp = (Queue)super.getStart();
		String full = "";
	    while(super.next != null) {
	     full += temp.data + " ";
	     temp = (Queue)temp.next;
	    }
		return full;
	}
	
	// No destructor java uses garbage collection
}

