import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack (5);
		int n = sc.nextInt();
		for (int i=0; i<n; i++ )
		{
			int x = sc.nextInt();
			if(st.isEmpty()|| st.peek()<x)
				st.push(x);
		else {
			int xx = st.pop();
			st.push(x);
			st.push(xx);
		}
		}
		
		
		System.out.println(st.peek());
	}
}

