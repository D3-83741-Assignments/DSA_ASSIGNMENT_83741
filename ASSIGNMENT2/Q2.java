import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		
		int arr[] = new int [n];
		for (int i = 0; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(insertionsort(arr));
}
 
 
 public static int insertionsort(int arr[]) {
	int n = arr.length;
	int compas =0;
	 for (int i=1; i<n ;i++)
		{
			int temp =arr[i];
			int j = i-1;
			while (j>=0 && arr[j]<temp)
			{
				arr[j+1]=arr[j];
				compas++;
				
				j--;
			}
			arr[j+1]=temp;
		}		
	 for (int c : arr) {
		 System.out.print(c+" ");		
	}
	 System.out.println();
			return compas;
 }
}
