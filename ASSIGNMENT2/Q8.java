import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the queue size");
		int n =sc.nextInt();
		Circularqueue q = new Circularqueue(n);
		
		int c = -1;
		while (c!= 0)
		{
			System.out.println("0.Exit  1.Push  2.Pop   3.Peek  4. size ");
			c = sc.nextInt();
			switch(c) {
			case 0:break;
			case 1:
				q.push(sc.nextInt());
			break;
			case 2:
				q.pop();break;
			case 3:
				System.out.println(q.peek());break;
			case 4:
			System.out.println(q.size());
			
			}
			
		}
		
	System.out.println("Wrong choice");
		
	}
}
class Circularqueue
{
	int arr[];
    final int size;
	int front , rear;
	int cnt;
	public Circularqueue (int size)
	{
		this.size =size;
		arr = new int[size];
		cnt =0;
		front = rear = 0;
	}
	
	public void push(int ele)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return ;
		}
		arr[rear++] = ele;
		rear = (rear+1)%size;
		cnt ++;
	}
	public int pop()
	{
		if (isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		int x = arr[front];
		rear = (rear+1)%size;
		cnt--;
		return x;
	}
	
	
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			
		}
		return arr[front];
	}
	
	
	
	public boolean isEmpty() {
		
	return cnt ==0;
	}
	
	
	
	public boolean isFull()
	{
		
		return cnt ==size;
		
	}
	public int  size()
	
	{
//		if(isEmpty())
//		{
//			System.out.println("Queue is empty");
//			return -1;
//		}
		return cnt;
	}
}
