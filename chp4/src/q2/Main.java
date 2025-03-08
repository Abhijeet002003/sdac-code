package q2;

class Emp{
	String name;
	int id;
	double sal;
	String address;
	public Emp(String name, int id, double sal, String address) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object deleted");
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp("Abhijeet", 20, 1000, "Mumbai");
		
		emp=null;
		System.gc();
	}

}



