package model;
import java.util.*;
import UserDefined.*;

public class Demo 
{
	public static void main(String[] args)
	{
		String password,uname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username : ");
		uname=sc.next();
		Account a=new Account(uname);
		try	{	
		if (a.validateUsername())
		{
			System.out.println("Welcome "+uname);
			System.out.println("Enter password : ");
			password= sc.next();
			Account b =new Account(uname,password);
			try {
				if(b.validatePassword())
				{
					System.out.println("UserName :"+uname+"Password :"+password);
				}
				else
				{
					throw new InvalidPasswordException(); 
				}
			}
			catch(InvalidPasswordException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		else
		{
			throw new InvalidUserNameException();
		}
			
		}
		
		catch(InvalidUserNameException obj)
		{
			System.out.println(obj.getMessage());
		}
		
		
		
		
	}
	

}
