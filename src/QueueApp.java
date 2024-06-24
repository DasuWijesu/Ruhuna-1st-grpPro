import java.util.Scanner;
class QueueX{
	private int maxSize; //size of queue array
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public QueueX(int s) {
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(int j) {
		
		if (rear == maxSize-1) {
			System.out.println("Queue is full");
		}else {
		queArray[++rear] = j;
		nItems ++;
		}
	}
	
	public int remove() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}else {
			nItems--;
			return queArray[front++];
		}
	}
	
	public int peekFront() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}else {
			return queArray[front]; 
		}
	}
	
//	public boolean isFull() {
//		return (nItems == maxSize);
//	}
//	
//	public boolean isEmpty() {
//		return (nItems == 0);
//	}
}

public class QueueApp {

	public static void main(String[] args) {
		

	}

}
