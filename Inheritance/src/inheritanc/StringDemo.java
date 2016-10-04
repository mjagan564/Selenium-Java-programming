package inheritanc;

public class StringDemo {
	String name="Hello World";
	public void method()
	{
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(" Saibersys"));
		System.out.println(name.charAt(6));
	}
	

	public static void main(String[] args) {
		StringDemo stringDemo=new StringDemo();
		stringDemo.method();
		

	}

}
