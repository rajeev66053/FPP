package eighth_assignment;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private static int front = -1;
	private static int rear = 0;
	
	
	public int peek() {

		//implement
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			return arr[front];
		}
	}
	
	public void enqueue(int obj){
		//implement
		if(rear==arr.length) {
			resize();
		}
		if(front==-1) {
			front++;
		}
		arr[rear]=obj;
		rear=rear+1;
	}
	
	public int dequeue() {

		//implement
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			int dequeElement=arr[front];
			front=front+1;
			return dequeElement;
		}
	}
	
	public boolean isEmpty(){
		//implement
		if(front==-1 || front>=rear) {
			return true;
		}
		return false;
	}
	
	public int size(){
		//implement
		if(isEmpty()) {
			return 0;
		}
		return rear-front;
	}
	
	private void resize(){
		//implement
		int[]tempArray=new int[arr.length+1];
		System.arraycopy(arr, 0, tempArray, 0, arr.length);
		arr=tempArray;
	}

}
