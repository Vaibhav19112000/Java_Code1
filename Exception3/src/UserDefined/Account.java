package UserDefined;

public class Account 
{
	private String uname,password;
	
	public Account(String uname,String password)
	{
		this.uname=uname;
		this.password=password;
		
	}
	public Account(String uname)
	{
		this.uname=uname;
		
		
	}
	public boolean validateUsername()
	{
		boolean flag=false;
		if(uname.charAt(0)>=65&&uname.charAt(0)<=90)
		{
			if(uname.length()>=5&&uname.length()<=10)
				flag=true;
			
		}
		return flag;
	}
	public boolean validatePassword() 
	{    boolean flag=false;
		for(int a=0;a<password.length();a++)
		{
			if(password.length()>=5&&password.length()<=8)
			{
				if(password!=uname)
				{
					if(password.charAt(a)>48&&password.charAt(a)<57)
					{
						flag=true;
					}
				}
				
			}
		}
		return flag;
	}

}
