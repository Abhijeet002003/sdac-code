package staticinnerclass;

class A{
	static int a=20;
	
	static class B{
		static void meth() {
			System.out.println(a);
			
		}
	}
}


public class Main {
	public static void main(String[] args) {
		A.B b=new A.B();
        A.B.meth();
	}

}



