package notes04_Inheritance_Intro;

public class Car extends GasVehicle {

	//parameters
	private int numDoors;
	private boolean isLuxury;
	private boolean hasTrunk;
	private boolean isConvertible;
	
	
	//Constructor
	public Car(int numCylinders, int numPassengers,
	           int numMiles, String make,
	           String model, String color,
	           int numDoors, boolean isLuxury, 
	           boolean hasTrunk, boolean isConvertible) {
		
		//1st call super class's constructor
		super(numCylinders, numPassengers,
	           numMiles, make,
	           model, color);
		
		//then do whatever this constructor needs
		this.numDoors = numDoors;
		this.isLuxury = isLuxury;
		this.hasTrunk = hasTrunk;
		this.isConvertible = isConvertible;
		
	}
	
	public void reduceMiles(int numMiles) {
		super.addMiles(-1 * numMiles);
	}
	
	
	@Override
	public String toString() {
		String str = super.toString() + "\n";
		
		str += "#Doors  = " + numDoors+ "\n";
			  
		if (isLuxury) {
			str += "Luxury? = Yes\n";
		}
		else {
			str += "Luxury? = No\n";
		}
		
		if (hasTrunk) {
			str += "Trunk? = Yes\n";
		}
		else {
			str += "Trunk? = No\n";
		}
		
		if (isConvertible) {
			str += "Convertible? = Yes\n";
		}
		else {
			str += "Convertible? = No\n";
		}
		
		
		
		return str;
	}
	
	
	
	
	
	
	
}
