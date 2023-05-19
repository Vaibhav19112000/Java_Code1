package UserDefined;

public class InvalidUserNameException extends Exception
{
	
	@Override
	public String getMessage()
	{
		return "Invalid username";
		
	}

}
