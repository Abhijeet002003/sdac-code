package constructor;
 class Car {
    private String model;
	private double price;
	private int numberplate;
 
	
	
	

    public Car(String model, double price, int numberplate) {
		super();
		this.model = model;
		this.price = price;
		this.numberplate = numberplate;
	}

    
    public void displayCarDetails(){
    	System.out.println(model);
    	System.out.println(price);
    	System.out.println(numberplate);
    }
    	
 }
  class car{
	    public static void main(String[] args) {
	        // Creating car objects using the parameterized constructor
	        Car car1 = new Car("Toyota Camry", 30000, 2500);
	        Car car2 = new Car("Honda Civic", 25000, 2000);
	        Car car3 = new Car("Ford Mustang", 55000, 5000);

	        // Displaying car details
	        car1.displayCarDetails();
	        car2.displayCarDetails();
	        car3.displayCarDetails();
	        
	    }
  }