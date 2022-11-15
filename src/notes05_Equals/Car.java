package notes05_Equals;

public class Car {

	//Parameters
	private String make;
	private String model;
	private int miles;
	
	//Constructor
	public Car(String make, String model, int miles) {
		this.make = make;
		this.model = model;
		this.miles = miles;
	}
	
	//Setter Methods Not Shown
	
	//Getter Methods
	public String getMake() {return make;}
	public String getModel() {return model;}
	public int getMiles() {return miles;}
	
	
	@Override
	public boolean equals(Object o) {
		
		//check if it's a Car object
		if (o instanceof Car) {
			
			//Type-Cast to Car
			Car other = (Car) o;
			
			//check parameters
			if (this.model.equals(other.getModel())
				&& this.miles == other.getMiles()) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		String str = "Make = " + make +
					 "Model = " + model +
					 "Miles = " + miles;
		return str;
	}
}
