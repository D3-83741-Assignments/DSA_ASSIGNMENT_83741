import java.util.PriorityQueue;

public class Q4 {

	public static void main(String[] args) {
//		PriorityQueue<Integer> q = 	new PriorityQueue<Integer>();
//		q.add(i)
		Queue q = new Queue(5);
		q.push(0);
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
	}
}
class Queue 
{
 int front = 0 ,  rear =0;
  final int size;
  int arr[];
  public Queue(int size)
  {
	this.size = size;
	arr =new int[size];
	  
  }
   public void push (int ele)
   {
	   if(isFull()) {
		   System.out.println("Queue is full");
		   return;
	   }
	   arr[rear++] =ele;
   }
   
   public int pop(int ele)
   
   {
	  if(isEmpty())
		  return -1;
	  return arr[front ++];
	   
   }
   public boolean isEmpty ()
   {
	   return front==rear && front ==0;
   }
   public boolean isFull()
   {
	   return  rear ==size;
   }
   public int peek()
   {
	   if(isEmpty()) {
		   System.out.println("Queue is empty");
		   return -1;
	   }
	return arr[front];
	   
   }
}