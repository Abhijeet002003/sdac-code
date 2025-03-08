package q2;

class Emp{
	static String company="avmtech";
	String name="Abhijeet";
	int id=123;
	int salary=12500;
	
	static void displayCompany() {
		System.out.println(company);
		
		
	}
	void displayinfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
}





 
public class Main {
   public static void main(String[] args) {
	   Emp obj=new Emp();
	   obj.displayinfo();
	   Emp.displayCompany();
	   
	
}
}
