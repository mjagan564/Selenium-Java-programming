package inheritanc;

public class Car {
	public void move()
	{
		System.out.println( "Cars moves" );
	}
	public void horn()
	{
		System.out.println("Normal sounds");
	}
	protected void key()
	{
		System.out.println("this is my personal");
	}

	public static void main(String[] args) {
		
		Car car=new Car();
		car.move();
		car.horn();
		car.key();
		
		
		
	

	}

}
