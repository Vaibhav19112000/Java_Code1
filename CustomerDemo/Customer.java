
public class Customer
{
	private String emailid;
	Address a;
	public Customer()
	{
		emailid="xyz@gmail.com";
		a= new Address();
	}
	public Customer(String em, Address a)
	{
		this.emailid=em;
		this.a=a;
	}
	public void display()
	{
		System.out.println(emailid);
		a.display();
	}
	

}
