package trycatch;
public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

		
		try {
			int a=10/0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		try {
			String s1=null;
			System.out.println(s1.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {

			String name="Abhijeet";
			int i=Integer.parseInt(name);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
		try {
			int arr[]=new int[5];
			arr[10]=20;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
	}

}



