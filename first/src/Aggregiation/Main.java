package Aggregiation;

import q5.main;

class Emp{
	String name;
	int id;
	String address;
	String hobbies;
}

void displayEmpinfo() {
	System.out.println(name);
	System.out.println(address);
	System.out.println(hobbies);
	System.out.println(id);
}

public class Main {
	 public static void main(String[] args) {
		 Emp obj=new Emp();
		 obj.displayEmpinfo();
	 }
}
class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void displayAddress() {
        System.out.println(city + ", " + state + ", " + country);
    }
}

class IDCard {
    private String idNumber;

    public IDCard(String idNumber) {
        this.idNumber = idNumber;
    }

    public void displayIDCard() {
        System.out.println("ID Card Number: " + idNumber);
    }
}

class Emp {
    String name;
    int id;
    String hobbies;
    Address address;  // Aggregation (Address exists independently)
    IDCard idCard;    // Composition (IDCard belongs to Employee)

    public Emp(String name, int id, String hobbies, Address address, String idNumber) {
        this.name = name;
        this.id = id;
        this.hobbies = hobbies;
        this.address = address;
        this.idCard = new IDCard(idNumber);  // IDCard is tightly bound to Emp (Composition)
    }

    public void displayEmpinfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hobbies: " + hobbies);
        System.out.print("Address: ");
        address.displayAddress();  // Aggregation: Address method called
        idCard.displayIDCard();    // Composition: IDCard method called
    }
}

public class Main {
    public static void main(String[] args) {
        Address addr = new Address("New York", "NY", "USA"); // Aggregation: Address exists independently
        Emp emp = new Emp("John Doe", 101, "Reading, Traveling", addr, "EMP12345"); // Creating employee
        emp.displayEmpinfo();  // Display employee details
    }
}