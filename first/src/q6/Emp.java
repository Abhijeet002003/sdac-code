package q6;

public class Emp {
	public int empId=10;            
    private String empName="Abhijeet";     
    protected double salary=10000;     
    String department="IT"; 
    
    
     void displayInfo() {
		// TODO Auto-generated method stub
    	 System.out.println(empId);
    	 System.out.println(empName);
    	 System.out.println(salary);
    	 System.out.println(department);

	}
     
     
   
}




class Access{
	public static void main(String[] args) {
		Emp emp=new Emp();
		System.out.println(emp.empId);
		System.out.println(emp.salary);
		System.out.println(emp.department);
	}
}

