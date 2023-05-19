
public class Address 
{
	private String city;
	private String area;
	private int pincode;
	
	public Address ()
	{
		city="Pune";
		area="FC Road";
		pincode=423101;
	}
	public Address (String city,String area, int pincode)
	{
		this.city=city;
		this.area=area;
		this.pincode=pincode;
	}
	public void display()
	{
		System.out.println("Address:: "+city+" "+area+" "+pincode);
	}

}
