package localinnerclass;

class A{
	void meth() {
		class B{
			void innermeth() {
				System.out.println("local inenr class meth");
			}
		}
		B b=new B();
		b.innermeth();
	}
}



public class Main {
	 public static void main(String[] args) {
			A a=new A();
			a.meth();

}
}	 
