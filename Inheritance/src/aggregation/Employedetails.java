package aggregation;

public class Employedetails {

	String name,gender,company;
	int empno;
	
	public void setemployedetails(int empno,String name,String gender,String company)
	{
		this.empno=empno;
		this.name=name;
		this.gender=gender;
		this.company=company;
		
	}
	public void printemployeedetails()
	{
		System.out.println(empno);
		System.out.println(name);;
		System.out.println(gender);
		System.out.println(company);
	}
	
	public static void main(String[] args) {

		Address address=new Address();
		Employedetails employedetails=new Employedetails();
		address.setData("3211", "marshlane", "Carrollton", "Texas", "USA");
		employedetails.setemployedetails(564, "Jagadeesh", "male", "Saibersys");
		System.out.println("*****Employedetails*****");
	    employedetails.printemployeedetails();
	    System.out.println("*****Adddress*****");
	    address.getDetails();
	    
		
		
		
		
	}

}
