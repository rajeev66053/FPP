package eighth_assignment1;

import java.util.LinkedList;

class Node{
	protected Object data;
	protected Node next;		
	
}

class LinkedListStack{
	private Node header; // stack top
	

	public LinkedListStack() // constructor
	{		
		header=new Node();
	}

	public void push(Object item) // add an item on top of stack
	{
			
			Node current=header;

			while (current.next != null) {
				current=current.next;
			}
			
			Node newNode=new Node();
			newNode.data=item; // insert an item
			
			current.next=newNode;

	}

	public Object pop() // remove an item from top of stack
	{
		if (isEmpty()) {
			System.out.println("StackInterface is empty");
			return null;
		}
		Node current=header.next;
		Node newTop=header;
		while(current.next!=null) {
			newTop=current;
			current=current.next;
		}
		Object item = current.data; // access top item
		
		newTop.next=null;
		
		return item;
	}

	public Object peek() // get top item of stack
	{
		if (isEmpty()) {
			return null;
		}
		
		Node current=header.next;
		
		while(current!=null) {
			current=current.next;
		}
		return current.data;
	}

	public boolean isEmpty() // true if stack is empty
	{
		Node current=header.next;
		if(current==null) {
			return true;
		}
		return false;
	}

	public int size() // returns number of items in the stack
	{
		int count=0;
		Node current=header;
		while(current.next!=null) {
			current=current.next;
			count++;
		}
		return count;
	}
}