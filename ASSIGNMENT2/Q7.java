import java.util.Scanner;
import java.util.Stack;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		
		int arr[] = new int[n];
		for (int i=0; i<n; i++)
		{
			arr[i]= sc.nextInt();
			st.push(arr[i]);
		}
		int i =0;
		while (!st.isEmpty()) {
			arr[i++]=st.pop();
			
		}
		for (int c : arr) {
			System.out.print(c + "   ");
		}
		
		sc.close();
	}
	

}
