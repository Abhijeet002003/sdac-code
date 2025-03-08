package arrayList1;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp (12,"Abhijeet",150000);
		Emp emp1 = new Emp (10,"Abhi",15000);
		Emp emp2 = new Emp (11,"jeet",1500);
		Emp emp3 = new Emp (12,"Ahijeet",170000);
		
		List<Emp> list =new ArrayList<Emp>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		
		OperationsImp imp=new OperationsImp();
		imp.insertData(list);
		imp.showData();
		System.out.println("---------------------------------");
	    imp.updateData(12, "Ahijeet");
	    imp.showData();
	    System.out.println("--------------------------------");
	    imp.deleteData(12);
	    imp.showData();
	    System.out.println("----------------------------------------");
	    imp.searchData(10);
		
	}

}
