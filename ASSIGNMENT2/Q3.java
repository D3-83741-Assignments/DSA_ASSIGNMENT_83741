import java.util.Scanner;

public class Q3 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		
		employee arr[] = new employee [n];
		for (int i =0; i<n; i++)
		{
			arr[i] = new employee();
			arr[i].accept();
		}
		insertionsort(arr);
		
	
}
 
 
 public static int insertionsort(employee arr[]) {
	int n = arr.length;
	int compas =0;
	 for (int i=1; i<n ;i++)
		{
			employee temp =arr[i];
			int j = i-1;
			while (j>=0 && arr[j].salary>temp.salary)
			{
				arr[j+1]=arr[j];
				compas++;
				j--;
			}
			arr[j+1]=temp;
		}		
	 for (employee c : arr) {
		 System.out.print(c+" ");		
	}
	 System.out.println();
			return compas;
 }
	}

	
	
class employee implements Comparable

{
	static Scanner sc = new Scanner(System.in);
	String name ;
	int id;
	double salary ;
	public employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public employee() {}
	@Override
	public int compareTo(Object o) {
		employee e = (employee)o;
		return (int) (this.salary -e.salary);
	}
	void accept() {
		System.out.println("enter the id ");
		id= sc.nextInt();
		System.out.println("Enter the name");
		this.name =sc.next();
		System.out.println("Enter the salary");
		this.salary=sc.nextDouble();
		
		
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
