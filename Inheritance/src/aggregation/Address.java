package aggregation;

public class Address {
	
	
	String num,street,city,state,country;
	
	public void setData(String num,String street,String city,String state,String country )
	{
		this.num=num;
		this.street=street;
		this.city=city;
		this.state=state;
		this.country=country;
				
	}
	

	
	public void getDetails()
	{
		System.out.println(num);
		System.out.println(street);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
