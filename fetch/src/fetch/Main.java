package fetch;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Objects;

class Emp implements Cloneable{
	 String name;
	 int id;
	 double salary;
	 public Emp(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("deleted");
	}
 }

public class Main{
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp=new Emp("Abhijeet", 12, 12000);
		Emp emp2=new Emp("Abhijeet", 12, 12000);
		System.out.println(emp.equals(emp2));
		System.out.println(emp);
		Emp empclone=(Emp) emp.clone();
		System.out.println(empclone);
		
		
		Method method[] = emp2.getClass().getMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
			
		}
		
//		Method method[]=emp2.getClass().getMethods();
//		
//		for (int i = 0; i < method.length; i++) {
//		System.out.println(method[i]);
//			
//		}
		
		
		
		
		emp=null;
		System.gc();
		
	}
}