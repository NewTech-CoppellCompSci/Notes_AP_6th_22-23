package notes05_Equals;

public class Runner {

	public static void main(String[] args) {
		
		Pet p1 = new Pet("Samuel", "Bad Boy", 20);
		Pet p2 = new Pet("Frank", "cat", 96);
		Pet p3 = new Pet("Samuel", "Bad Boy", 20);
		
		if (p1.equals(p2)) {
			System.out.println("Yes! p1 = p2");
		} else {
			System.out.println("No! p1 != p2");
		}
		System.out.println("\n");
		
		
		if (p1.equals(p3)) {
			System.out.println("Yes! p1 = p3");
		} else {
			System.out.println("No! p1 != p3");
		}
		System.out.println("\n");

		
		
		
		Car c1 = new Car("McLaren", "Senna", 1);
		Car c2 = new Car("McLaren", "Senna", 1);
		Car c3 = new Car("Ford", "Pinto", 378651);
		
		if (c1.equals(c2)) {
			System.out.println("Yes! c1 = c2");
		} else {
			System.out.println("No! c1 != c2");
		}
		System.out.println("\n");
		
		
		if (c1.equals(c3)) {
			System.out.println("Yes! c1 = c3");
		} else {
			System.out.println("No! c1 != c3");
		}
		System.out.println("\n");

		
		
		
	}

}
