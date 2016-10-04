package inheritanc;

public class Cycle extends Car {
	
	public void gas()
	{
		System.out.println("No need gas");
	}
	public void energy()
	{
		System.out.println("need more eneregy");
		
	}

	public static void main(String[] args) {
		
		Cycle cycle=new Cycle();
		cycle.gas();
		cycle.energy();
		cycle.horn();
		cycle.move();
		

	}

}
