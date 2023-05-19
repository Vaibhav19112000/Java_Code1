import java.util.*;
public class Ass2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Size of Array : ");
		int size=sc.nextInt();
		int arr[]=new int [size];
		for (int a=0;a<arr.length;a++)
		{
			System.out.println("Enter the Elements");
			int b=sc.nextInt();
			arr[a]=b;
			
		}
		Ass2.display(arr);
		
		
	} 
	 
	
		
		public static void display(int a[])
		{
			try 
			{
				Scanner sc= new Scanner (System.in);
				System.out.println("Which Index Element Do You Want : ");
				int s=sc.nextInt();
				System.out.println(a[s]);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
	 }
	

}
