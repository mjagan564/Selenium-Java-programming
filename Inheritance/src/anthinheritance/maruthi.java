package anthinheritance;

import inheritanc.Car;

public class maruthi extends Car{
	
	public void old()
	{
		System.out.println("this is old model");
		
	}
	public void best()
	{
		System.out.println("old is best");
	}

	public static void main(String[] args) {
		
		maruthi mar= new maruthi();
		mar.old();
		mar.best();
		mar.horn();
		mar.move();
		
		
		

	}

}
