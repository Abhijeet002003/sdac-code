package super_keyword;
class Shop{
 String Shopname="atc";
 
 void displayinfo(){
	 System.out.println("shop");
 }
	
}
 class Owner extends Shop{
	 @Override
	void displayinfo() {
		// TODO Auto-generated method stub
		super.displayinfo();
	}
	 
	 
 }



public class Main {
	public static void main(String[] args) {
		Owner owner=new Owner();
		owner.displayinfo();
	}

}
