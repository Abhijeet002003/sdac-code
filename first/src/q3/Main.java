package q3;

class Emp{
	double sal(int sal) {
		return sal;
	}
	double sal(int sal, int tax) {
		return sal+tax;
	}
	 double sal (int sal, int tax,int bonus) {
		 return sal+tax+bonus;
	 }
}






public class Main {
   public static void main(String[] args) {
	Emp obj=new Emp();
	obj.sal(12500);
	System.out.println(obj.sal(12500));
	System.out.println(obj.sal(12500,500));
	System.out.println(obj.sal(12500,500,1000));
}
}
