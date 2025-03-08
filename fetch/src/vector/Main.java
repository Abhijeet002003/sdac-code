package vector;

import java.util.Vector;

public class Main {
	 public static void main(String[] args) {
		  Emp emp=new Emp(10, "Abhijeet", 1000000);
			Emp emp1=new Emp(11, "Tom", 250000);
			Emp emp2=new Emp(12, "Jerry", 300000);
			Emp emp3=new Emp(13, "Harry", 150000);
			
			Vector<Emp> vector=new Vector<Emp>();
			vector.add(emp);
			vector.add(emp1);
			vector.add(emp2);
			vector.add(emp3);
			
			OperationImp imp=new OperationImp();
			imp.insertData(vector);
			imp.showData();
			System.out.println(".....................................");
			imp.updateData(10, "Kary");
			imp.showData();
			System.out.println("......................................");
			imp.deleteData(10);
			imp.showData();
			System.out.println("......................................");
			imp.searchData(11);
			
			
			

}
	 
	 
}
