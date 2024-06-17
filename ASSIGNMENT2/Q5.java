
public class Q5 {
	
	public static void main(String[] args) {
		
		Stack st = new Stack(5);

		st.push(0);
		st.push(1);
		st.push(2);
		System.out.println(st.peek());
		st.push(3);
		st.pop();
		System.out.println(st.peek());
		st.push(4);
		
	}

}

class Stack {
	int top;
	final int size;
	int arr[];
	public Stack(int size)
	{
		this.size = size;
		top= size;
		arr = new int [size];
		
	}
	
	public boolean isEmpty()
	{
	 return top==size;	
	}
	public boolean isFull()
	{
		return top == -1;
	}
	public void push( int ele)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		top --;
		arr[top] =ele;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1;
		}
		
		return arr[top++];
		
	}
	public int peek () {
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1;
		}
		
		return arr[top];
		
	}
	
}


