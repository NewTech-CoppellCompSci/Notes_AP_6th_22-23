package notes05_Equals;

public class Pet {

	//parameters
	private String name;
	private String type;
	private int age;
	
	//Constructor
	public Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	//Setter Methods Not Shown
	
	//Getter Methods
	public String getName() {return name;}
	public String getType() {return type;}
	public int getAge() {return age;}
	
	
	@Override
	public boolean equals(Object object) {
		
		//Is this a Pet object?
		if (!(object instanceof Pet)) {
			return false;
		}
		
		//Type Case to Pet object
		Pet other = (Pet) object;
		
		//Check whatever parameters you want/need
		if (this.name.equals(other.getName())
				&& this.type.equals(other.getType())
				&& this.age == other.getAge()) {
			return true;
		}
		
		
		
		return false;
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		String str = name + " is a " +
					 age + " year old " + 
					 type + ".";
		return str;
	}
	
	
	
}
