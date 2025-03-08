package finallyblock;

public class Main {
	  public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello world");
		
		try {
			int a=10/0;
		}
		finally {
			System.out.println("Finally block");
			System.out.println("Hello world");
			System.out.println("Hello world");
			
		}
	}
	}