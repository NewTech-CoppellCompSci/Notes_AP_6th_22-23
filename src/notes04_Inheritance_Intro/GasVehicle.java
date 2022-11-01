package notes04_Inheritance_Intro;

public class GasVehicle {

	private int numCylinders;
	private int numPassengers;
	private int numMiles;
	private String make; //brand
	private String model;
	private String color;
	
	public GasVehicle(int numCylinders, int numPassengers,
			           int numMiles, String make,
			           String model, String color) {
		this.numCylinders = numCylinders;
		this.numPassengers = numPassengers;
		this.numMiles = numMiles;
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	/*
	 * Getter Methods
	 */
	public int getNumCylindrs() {return numCylinders;}
	public int getNumPassengers() {return numPassengers;}
	public int getNumMiles() {return numMiles;}
	public String getMake() {return make;}
	public String getModel() {return model;}
	public String getColor() {return color;}
	
	
	/*
	 * Setter Methods
	 */
	public void addMiles(int miles) {
		this.numMiles += miles;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setNumCylinders(int numCylinders) {
		this.numCylinders = numCylinders;
	}
	
	
	@Override
	public String toString() {
		String str = "Make = " + make + "\n" +
					 "Model = " + model + "\n" + 
					 "Color = " + color +  "\n" +
					 "Mileage = " + String.format("%,d", numMiles) +  "\n" +
					 "Passengers = " + numPassengers + "\n" + 
					 "Cylinders = " + numCylinders;
		
		return str;
	}
	
	
	
	
	
	
}
