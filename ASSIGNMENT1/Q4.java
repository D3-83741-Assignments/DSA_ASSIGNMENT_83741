/**
 * que4
 */
public class que4 {
    public static void searchById(Employee[] emparr, int id){
        for (Employee employee : emparr) {
            if (employee.empId == id) System.out.println(employee.toString());
        }
      
        
    }
    public static void searchByName(Employee[] emparr,String name){
        for (Employee employee : emparr) {
            if (employee.name == name) System.out.println(employee.toString());
        }
      
        
    }
    public static void searchBySal(Employee[] emparr, double sal){
        for (Employee employee : emparr) {
            if (employee.salary == sal) System.out.println(employee.toString());
        }
      
        
    }

    public static void main(String[] args) {
        Employee[] emparr = 
        {
            new Employee(101,"sudh",5000),
            new Employee(102,"anshu",5000),
            new Employee(103,"singh",5000)
    };

   searchById(emparr, 101);
   searchBySal(emparr, 5000);
    
    }

   
}

