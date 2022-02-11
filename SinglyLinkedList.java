package lab3;
/*   
 *  Name Block:
 *  Lab Number: Lab 2
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */
abstract class SinglyLinkedList{
	private int count;
	private LinkNode start = null;
	private LinkNode end = null;
	
	public LinkNode getStart() {
		return start;
	}
	public void setStart(LinkNode start) {
		this.start = start;
	}
	
	public LinkNode getEnd() {
		return end;
	}
	public void setEnd(LinkNode end) {
		this.end = end;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public void addCurrency(Currency currency, int linkNodeValue) {
		LinkNode newLinkNode = new LinkNode;
		if(start == null) {
			start = newLinkNode;
			end = newLinkNode;
		} else {
			end.next = newLinkNode;
			end = newLinkNode;
		}
	}
	
	public void removeCurrency(Currency currency) {
		if(start != null) {
			end = null;
		    end = end(currency,count -1);
		    start = end(currency, count -1);
		}else {
			System.out.println("Doesnt work list is empty");
		}
	}
	
	public void removeCurrency(int linkNodeValue) {
		
	}
	
	public void findCurrency(Currency currency) {
		return nodeIndexOfcurrency;
	}
	
	public void getCurrency(int indexvalue){
		return currency;
	}
	
	public String printList() {
		return CurrencyObjectsInOrder;
	}
	
	public Boolean isListEmpty(){
		return true;
	}
	
	public int countCurrency(){
	    int count = 0;
		LinkNode current = start;
		while(current != null) {
			count++;
			current = current.LinkNode;
		}
		return count;
	}
	
	// any other usefull methods
	
	
}
