/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */
public class SinglyLinkedList extends LinkNode{
  private LinkNode start;
  private LinkNode end;
  private int count;

// Constructors dont need pre or post
public SinglyLinkedList(){
	start = end = null;
	count = 0;
}

public SinglyLinkedList(SinglyLinkedList list) {
	this.start = list.start;
	this.end = list.end;
	this.count = list.count;
}

/* Algorithm addCurrency(Currency object currency, LinkNode reference index) 
 * 
 * The purpose of this method is to add a currency object to the linked list
 * Pre: Currency currency - Currency Object
 * 		LinkNode index - LinkNode index index
 * Post: adds currency object to the list and returns 
 */

public void addCurrency(Currency currency,LinkNode index) {
	if(start == null) {
		start = end = index;
		return;
	}
	end.next = index;
	end = index;
	count++;
}

/* Algorithm removeCurrency(LinkNode object index)
 * 
 * The purpose of this method is to remove a currency object at a selected index of the list
 * Pre: index - LinkNode object 
 * Post: Currency object in the list removed and LinkNode pointer set to null (empty)
 *    or List with currency object removed and LinkNode pointer set to previous node
 *    or prints the node isnt there
 * 
 * if(find is true)
 *  LinkNode t and prev become start headers
 *  	if(the first nodes currency object is equal to the indexs currencu object){
 *        LinkNode t2 becomes start header
 *        start pointer becomes next start pointer
 *        t2 becomes null because its empty
 *        the count decremenes
 *        return
 *      end if
 *   while(t is not empty)
 *    if(t nodes currency object equals index nodes currency object)
 *     the prev node and t node points next 
 *     if(t node = end)
 *       end node becomes previous node
 *       t node becoms null
 *       count decremenrs
 *       return
 *     end if
 *      prev node equals t node
 *      t node equals next t node
 *    end if
 *    end while
 *    else
 *     print the node was not found
 *    end if 
 * 
 */

public void removeCurrency(LinkNode index) {
	if(find(index)) {
		LinkNode t = start, prev = start;
		if(start.data == index.data) {
			LinkNode t2 = start;
			start = start.next;
			t2 = null;
			count = count - 1;
			return;
		}
	while(t!=null){
		if(t.data == index.data) {
			prev.next = t.next;
			if(t == end) 
				end = prev;
			    t = null;
			    count = count - 1;
			    return;
		}
		prev = t;
		t = t.next;
	}
	}
	else {
		System.out.println("The node was not found");
	}
}

/* Algorithm find(LinkNode idex)
 * 
 * This method finds the index were looking for and tells us if it has data in it
 * Pre: index - a Node of the linkedlist
 * Post: return true or false
 * 
 * while(temp node is not empty)
 * 	if(temp nodes currency object is equal to index nodes currency object)
 * 		return true
 *   end if
 *  temp node equals next temp node
 * end while
 *  return false
 */

public boolean find(LinkNode index) {
	LinkNode t = start;
	while(t != null) {
		if(t.data == index.data) {
			return true;
		}
	t = t.next;
	}
	return false;
}


/*  Algorithm findCurrency(Currency currency)
 * 
 * The purpose of this method is to find the index at which the inputed currency is located
 * Pre:  currency - Currency object
 * Post: return currency object or null
 * 
 * while ( s nodes is not null)
 *  if(s nodes currency object is equal to currency)
 *   return the s nodes currency object
 *  end if 
 *  s node equals next s node
 *  end while 
 *   print not found
 * 	 return null;
 */ 
 

public Currency findCurrency(Currency currency) {
	LinkNode t = start;
	while(t != null) {
		if(t.data == currency) {
			return t.data;
		}
		t = t.next;
	}
	System.out.print("Not found");
	return null;
}

/* Algorithm getCurrency (LinkNode index)
 * 
 * The purpose of this method is to find the index at which the inputed currency is located
 * Pre:  currency - Currency object
 * Post: return currency object or null
 * 
 * while ( s nodes is not null)
 *  if(s nodes is equal to index node)
 *   return the s nodes currency object
 *  end if 
 *  s node equals next s node
 *  end while 
 *   print not found
 * 	 return null;
 */

public Currency getCurrency(LinkNode index) {
	LinkNode t = start;
	while(t != null) {
		if(t == index) {
			return t.data;
		}
		t = t.next;
	}
	System.out.print("Not found");
	return null;
}

/*
 * Algorithm: printList(LinkNode index)
 * 
 * The purpose of this method is to return a string which is a collection of all the Currency objects contained in the list
 * Pre: index - linknode object
 * Post: returns a string of all the currency objects in the stacks
 * 
 * while(the next node is not null)
 * 
 * the full string adds one data object of the list with a space
 * 
 * the next data object is marked to be added to the full string on the next round
 * 
 * while end
 * 
 * return full
 */

public String printList(LinkNode index){
	LinkNode t = start;
	String full = "";
	while(t != null) {
		full += t.data + " ";
		t = t.next;
	}
	return full;
}


/* Algorithm isListEmpty(LinkNode index)
 * 
 * The purpose of this Method is to check if the list is empty or not
 * Pre:  index - an input LinkNode object
 * Post: true or false
 * 
 * if(items in list is zero)
 * 	return true
 * end if
 * 	return false
 */

public boolean isListEmpty(LinkNode index) {
	if(count == 0) {
		return true;
	}
	return false;
}

/* The purpose of this method is to get the length of the list;
 * Pre:  No input
 * Post: Returns amount of items in list
 */

public int countCurrency() {
	return count;
}

/*
 * The purpose of these methods is to be getters for the class attributes
 * Pre:  No input
 * Post: Returns attribute of the class
 */

public LinkNode getStart() {
	return start;
}

public LinkNode getEnd() {
	return end;
}

public int getCount() {
	return count;
}

/*
 * The purpose of these methods is to be setters for the class attributes
 * Pre: LinkNode start, end or Int count
 * Post: No output (this start equals start)
 */

public void setStart(LinkNode start) {
	this.start = start;
}

public void setEnd(LinkNode end) {
	this.end = end;
}

public void setCount(int count) {
	this.count = count;
}  
}
