
public class Account
{
	private int accno;
	private String accname;
	private double bal;
	static int i_rate;
	
	public  Account ()
	{
		accno=12345678;
		accname="NA";
	    bal=200000;
		
	}
	public  Account (int a, String b,double s)
	{
		this.accno=a;
		this.accname=b;
		this.bal=s;
		
	}
	public static void irate(int i)
	{
		i_rate=i;
	}
	public void calBal()
	{
		bal=i_rate*bal;
		System.out.println("Balance :: "+bal);
	}
	

}
