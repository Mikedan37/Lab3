/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */
public class Stack extends SinglyLinkedList{
	
	//Dont need pre post documentation for Constrictors
	public Stack() {
		super();
	}

	public Stack(Stack stack){
		stack.setStart(null);
		stack.setEnd(null);
		stack.setCount(0);
	}
	
	/*
	 * The purpose of this method is to push desired Currency object to the top of the stack
	 * Pre: index - a LinkNode node which lets us send object to top of the stack 
	 *      currency - A currency object which will be added to the stack 
	 * Post: Calls addCurrency method with the inputs index and currency
	 */
	
	public void push(LinkNode index,Currency currency) {
		super.addCurreny(currency, index);
	}
	
	/*
	 * The purpose of this method is to pop the top object in the stack
	 * Pre: No input
	 * Post: Calls removeCurrency method to the top of the stack
	 */
	
	public void pop() {
		super.removeCurrency(super.getEnd());
	}
	
	/*
	 * The purpose of this method is to return the Currency object that is on the top of the stack
	 * Pre: No input
	 * Post: returns tail currency with the data reference variable of the Currency object
	 */
	
	public Currency peek(){
		return super.getEnd().data;
	}
	
	/*
	 * Algorithm: printStack
	 * 
	 * The purpose of this method is to return a string which is a collection of all the Currency objects contained in the stack
	 * Pre: No input
	 * Post: returns a string of all the currency objects in the stacks
	 * 
	 * while(the next node is not null)
	 * 
	 * the full string adds one data object of the stack
	 * 
	 * the next data object is marked to be added to the full string 
	 * 
	 * while end
	 * 
	 * return full
	 */
	
	public String printStack(){
		Stack temp = (Stack)super.getStart();
		String full = "";
	    while(super.next != null) {
	     full += temp.data + " ";
	     temp = (Stack) temp.next;
	    }
	    return full;
	}
	
	// Java uses garbage collector so no destructor
}
