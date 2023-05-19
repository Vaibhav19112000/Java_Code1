import java.util.*;

public class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Password : ");
		String password= sc.next();
		try {
		if(checkPassword(password))
			System.out.println("Password accepted !!! ");
		else
			if(password.length()<8)
			{
				throw new PasswordTooShortException();
			}
			else
			{
				throw new PasswordTooLongException();
			}
		}
		catch(PasswordTooShortException|PasswordTooLongException p)
		{
			System.out.println(p.getMessage());
		}
		
	}
	public static boolean checkPassword(String password)
	{   boolean flag=false;
		if(password.length()>8&&password.length()<12)
		{
			flag=true;
			
		}
		else if(password.length()<8)
		{
			flag=false;
		}
		else if(password.length()>12)
		{
			flag=false;
		}
		return flag;
     }
	}
