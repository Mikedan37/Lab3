/*   
 *  Name Block:
 *  Lab Number: Lab 3
 *  Name: Michael Danylchuk, Maxim Manokhin
 *  Team: 1
 *  The purpose of this assignment is to demonstrate our understanding of polymorphism, encapsulation
 *  and classes by creating a currency simulator that can add compare and manipulate objects
 */

public class LinkNode {
 
 public int data;
 public Dollar next;
 
 public Dollar getData() {
	return data;
}

public void setData(Dollar data) {
	this.data = data;
}

public LinkNode getNext() {
	return next;
}

public void setNext(LinkNode next) {
	this.next = next;
}


 
 public LinkNode() {
	 data = new Dollar();
	 next = null;
 }
 
 public LinkNode(int notevalue, int coinvalue) {
	 data = new Dollar(notevalue,coinvalue);
	 next = null;
 }
 
 public LinkNode(LinkNode nd) {
	 this.data = nd.data;
	 this.next = nd.next;
 }
}
