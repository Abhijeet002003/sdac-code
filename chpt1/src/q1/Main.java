package q1;
class Emp{
	String name="abhijeet";
	int id=123;
    double salary= 12500;
    String address="borivali";
    
    void displayinfo() {
      System.out.println(name);
      System.out.println(id);
      System.out.println(salary);
      System.out.println(address);
    }

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
    
    	
    
    
			
	
}





public class Main {
	
	public static void main(String[] args) {
		Emp obj=new Emp();
		obj.displayinfo();
		
	}

}
