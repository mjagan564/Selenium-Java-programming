package test;

public class variables {
	static int a=100;
	public int salary()
	{
		
	int mysalary =10000+2000+1500;
	mysalary=mysalary + a;
	
	return mysalary;
	}
	public static void main(String[]args){
		int b=200;
		System.out.println(a);
		System.out.println(b);
		
		variables obj =new variables();
		System.out.println(obj.salary());
		
	for (int i=1;i<=5;i++)
	{
		System.out.println(i);
		System.out.println(a);
		System.out.println(b);
	}
		
		
		
	}

}
