/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */
public class mainDriver {
	public static void main(String[] args) {
	//Print a Welcome message for demonstration of your ADTs
	System.out.println("Welcome to the demonstration of our ADTS: By Michael Danylchuk and Maxim Manokhin");
	
	// Create 20 Dollar objects in a Currency array
	Currency d1 = new Dollar(57.12);
	Currency d2 = new Dollar(23.44);
	Currency d3 = new Dollar(87.43);
	Currency d4 = new Dollar(68.99);
	Currency d5 = new Dollar(111.22);
	Currency d6 = new Dollar(44.55);
	Currency d7 = new Dollar(77.77);
	Currency d8 = new Dollar(18.36);
	Currency d9 = new Dollar(543.21);
	Currency d10 = new Dollar(20.21);
	Currency d11 = new Dollar(345.67);
	Currency d12 = new Dollar(36.18);
	Currency d13 = new Dollar(48.48);
	Currency d14 = new Dollar(101.00);
	Currency d15 = new Dollar(11.00);
	Currency d16 = new Dollar(21.00);
	Currency d17 = new Dollar(51.00);
	Currency d18 = new Dollar(1.00);
	Currency d19 = new Dollar(251.00);
	Currency d20 = new Dollar(151.00);
    Currency[] currencyObject = {d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20};
    
    // Create one of each
    SinglyLinkedList list = new SinglyLinkedList();
    Stack stack = new Stack();
    Queue queue = new Queue();
    
    /*
     * For Linked List
     */
    
    // A Add first seven objects from array to linked list so they end up in reversed order
    list.addCurrency(currencyObject[7], list);
    list.addCurrency(currencyObject[6], list);
    list.addCurrency(currencyObject[5], list);
    list.addCurrency(currencyObject[4], list);
    list.addCurrency(currencyObject[3], list);
    list.addCurrency(currencyObject[2], list);
    list.addCurrency(currencyObject[1], list);
    
    // B Search for $87.43 followed by $44.56 and print each
    list.findCurrency(87.43);
    System.out.println(list.findCurrency(87.43));
    list.findCurrency(44.56);
    System.out.println(list.findCurrency(44.56));
    
    // C Remove the node containing $111.22 followed by node at index 2
    list.removeCurrency(111.22);
    list.removeCurrency(2);
    
    // D Print contents of list
    list.printList(list);
    
    // E Add next 4 objects (9-12) such that their index in the linked list is calculated as (index in array % 5)
    list.addCurrency(currencyObject[8], list);
    list.addCurrency(currencyObject[9], list);
    list.addCurrency(currencyObject[10], list);
    list.addCurrency(currencyObject[11], list);
    
    // F Remove two objects at indexes (countCurrency % 6) and (countCurrency/7) in that order
    list.removeCurrency(currencyObject[list.countCurrency() % 6]);
    list.removeCurrency(currencyObject[list.countCurrency() / 7]);
    
    // G Print contents of list
    list.printList(list);
    
    /*
     * For the stack
     */
    
    // A push seven objects starting form the array index 13 onwards to the stack
    stack.push(stack, currencyObject[13]);
    stack.push(stack, currencyObject[14]);
    stack.push(stack, currencyObject[15]);
    stack.push(stack, currencyObject[16]);
    stack.push(stack, currencyObject[17]);
    stack.push(stack, currencyObject[18]);
    stack.push(stack, currencyObject[5]);
    
    // B Peek the top of the stack - print the resault
    stack.peek();
    System.out.print(stack.peek());
    
    // C Perform three pops in succession
    stack.pop();
    stack.pop();
    stack.pop();
    
    // D Print the contents of the stack
    stack.printStack();
    
    // E Push five more objects from start of array to the stack
    stack.push(stack, currencyObject[0]);
    stack.push(stack, currencyObject[1]);
    stack.push(stack, currencyObject[2]);
    stack.push(stack, currencyObject[3]);
    stack.push(stack, currencyObject[4]);
    
    // F Pop twice in succession
    stack.pop();
    stack.pop();
    
    // G Print the contents of the stack
    System.out.print(stack.printStack());
    
    /*
     * For the queue
     */
    
    // A Enqueue the seven objects at odd indexes starting from 5 in the array
    queue.enqueue(currencyObject[5], queue);
    queue.enqueue(currencyObject[7], queue);
    queue.enqueue(currencyObject[9], queue);
    queue.enqueue(currencyObject[11], queue);
    queue.enqueue(currencyObject[13], queue);
    queue.enqueue(currencyObject[15], queue);
    queue.enqueue(currencyObject[17], queue);
    
    // B Peek the fornt and end of the que - print the resaults
    queue.peekFront();
    System.out.println(queue.peekFront());
    queue.peekRear();
    System.out.println(queue.peekRear());
    
    // C Perform two dequeues in succession
    queue.dequeue();
    queue.dequeue();
    
    // D Print contents of the queue
    queue.printQueue();
    
    // E Enqueue five more objects from the index 10 in the array
    queue.enqueue(currencyObject[10], queue);
    queue.enqueue(currencyObject[10], queue);
    queue.enqueue(currencyObject[10], queue);
    queue.enqueue(currencyObject[10], queue);
    queue.enqueue(currencyObject[10], queue);
    
    // F Dequeue three times in succession
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    
    // G Print the contents of the queue
    System.out.println(queue.printQueue());
    
    // End the program with a leaving message of choice
    System.out.println("Hope you enjoyed the ADT demonstration! ");
    
    //If program would run * remember to clean up before the program ends -> System.exit(0); *
	}
}
