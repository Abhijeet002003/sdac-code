package q1;

class Emp{
	String name="Abhijeet";
	static String companyName="Avm";
	
	
	 void displayInfo() {
		// TODO Auto-generated method stub
		 System.out.println(name);

	}
	 
	 
	 static void companyInfo() {
		 System.out.println(companyName);
	 }
}

public class Main {
  public static void main(String[] args) {
	 Emp emp=new Emp();
	 System.out.println(emp.name);
	 emp.displayInfo();
	 
	 
	System.out.println(Emp.companyName);
	Emp.companyInfo();
}
}




