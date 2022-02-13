/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

public class SingleLinkedList extends LinkNode{
	 private LinkNode head;
	 private LinkNode end;
	 int count;
	
	public void finalize() {}
	
	public SingleLinkedList() {
		head = end = null;
		count = 0;
	}
	
	public SingleLinkedList(SingleLinkedList list){
		this.head = list.head;
		this.end = list.end;
		this.count = list.count;
	}
	
	public void add(LinkNode nd) {
		if(head == null) {
			head = end = nd;
			return;
		}
		end.next = nd;
		end = nd;
		count++;
	}
	
	public boolean find(LinkNode nd) {
		LinkNode temp = head;
		while(temp!=null) {
			if(temp.data == nd.data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public void delete(LinkNode nd) {
		if(find(nd)) {
			LinkNode temp = head,prev = head;
			if(head.data == nd.data) {
				LinkNode tp = head;
				head = head.next;
				tp = null;
				count--;
				return;
			}
		while(temp!=null){
			if(temp.data == nd.data) {
				prev.next = temp.next;
				 if(temp==end)
					 end = prev;
					 temp = null;
					 count --;
					 return;	 
			}
			prev = temp;
			temp = temp.next;
		  }
	    }
		else {
			System.out.println("The node was not found in the list");
		}
	}
	
	public int length() {
		return count;
	}
	
	public void display() {
		LinkNode temp = head;
		while(temp!=null) {
			System.out.println(temp.data.printCurrency());
			temp = temp.next;
		}
	}
}

