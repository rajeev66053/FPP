package eighth_assignment1;

public class LinkedListStackMain {
	public static void main(String[] args) {
		LinkedListStack stk = new LinkedListStack();
		Object item;
		stk.push('A'); // push 3 items onto stack
		stk.push('B');
		stk.push('C');
		stk.push('D');

		System.out.println("size(): " + stk.size());
		item = stk.pop(); // delete item
		System.out.println(item + " is deleted");
		System.out.println("size(): " + stk.size());
		stk.push('D'); // add three more items to the stack
		stk.push('E');
		System.out.println("size(): " + stk.size());
		System.out.println(stk.pop() + " is deleted");
		stk.push('G'); // push one item
		item = stk.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the StackInterface : " + stk.size());

		stk.push(20);
		stk.push(30);;
		item = stk.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");

	}

}
