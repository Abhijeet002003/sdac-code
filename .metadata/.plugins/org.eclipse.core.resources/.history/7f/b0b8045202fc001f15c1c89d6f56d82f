package q51;


class Account{
	double sal(int sal) {
		return(sal);
	}
	double sal(int sal, int tax) {
		return sal+tax;
	}
	 double sal (int sal, int tax,int bonus) {
		 return sal+tax+bonus;
	 }
}
class Hr extends Account{
	@Override
	double sal(int sal, int tax, int bonus) {
		// TODO Auto-generated method stub
		return super.sal(sal, tax, bonus);
	}
}


class Manager extends Account{
	@Override
	double sal(int sal, int tax) {
		// TODO Auto-generated method stub
		return super.sal(sal, tax);
	}
}


class Worker extends Account{
	@Override
	double sal(int sal) {
		// TODO Auto-generated method stub
		return super.sal(sal);
	}
}

public class Main {
     public static void main(String[] args) {
    	 Worker worker=new Worker();
    	 Manager manager =new Manager();
    	 Hr hr = new Hr();
    	 System.out.println(worker.sal(12500));
    	 System.out.println(manager.sal(20000, 2000));
    	 System.out.println(hr.sal(12500, 1000, 500));
    	 
		
	}
}
