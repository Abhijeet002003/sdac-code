package Aggregation;

class Emp{
	String name;
	String hobbies;
	double salary;
	int id;


void displayEmpinfo(){
	System.out.println(name);
	
	System.out.println(salary);
	System.out.println(id);
}

void hobbyinfo(){
	System.out.println(hobbies);
}
}

class Employee{
	Emp emp= new Emp();
	
}
public class Main {
	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.emp.displayEmpinfo();
		employee.emp.hobbyinfo();
	}
		
	}