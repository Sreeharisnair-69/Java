class Vehicle{
	String brand;
	String make;
	
	Vehicle(String brand,String make){
		this.brand=brand;
		this.make=make;
	}
	
	public void displayInfo(){
		System.out.println("Brand: "+brand);
		System.out.println("Make: "+make);
	}
}

class Car extends Vehicle{
	String fuelType;
	
	Car(String brand,String make,String fuelType){
		super(brand,make);
		this.fuelType=fuelType;
	}
	
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Fuel Type: "+fuelType);
	}
}

class ElectricCar extends Car{
	double batteryCapacity;
	
	ElectricCar(String brand,String make,String fuelType,double batteryCapacity){
		super(brand,make,fuelType);
		this.batteryCapacity=batteryCapacity;
	}
	
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Battery Capacity: "+batteryCapacity);
	}
}
public class CarInh {
	public static void main(String[] args) {
		ElectricCar ev = new ElectricCar("Tesla","Model S","Electric",57.50);
		ev.displayInfo();
	}
}
