package variables;


class Emp {
	String name;
	static String companyName = "Avm";

	void displayInfo(int id) {
		System.out.println(id);

	}

	public Emp(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}
}

public class main {
	public static void main(String[] args) {
		Emp emp = new Emp("Abhijeet");
		System.out.println(emp.name);
		emp.displayInfo(10);
		System.out.println(Emp.companyName);

	}

}


