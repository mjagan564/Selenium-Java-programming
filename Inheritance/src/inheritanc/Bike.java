package inheritanc;

public class Bike extends Car {
	public void petrol()
	{
		System.out.println("more milage");
		
	}
	public void wheels()
	{
		System.out.println("2 wheeler");
	}

	public static void main(String[] args) {
		
		Bike bike=new Bike();
		bike.petrol();
		bike.wheels();
		bike.horn();
		bike.move();
		

	}

}
