import java.util.Collection;
import java.util.*;

 class LinkedListDemo
{
	public static void main(String[] args) 
	{
		String str  ;
		LinkedList<String> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{System.out.println("0.exit\n1.Add\n2.Remove\n3.Search\n4.Display\n5.Update\n6.Sort");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter City Name : ");
			    str=sc.next();
				list.add(str);
				break;
		    case 2:
				System.out.println("Enter Which Position Or String Do You Want To Remove : ");
				str =sc.next();
				int i=sc.nextInt();
				list.remove(i);
				list.remove(str);
				break;
			case 3:
				System.out.println("Enter String : ");
				str=sc.next();
				list.contains(str);
				break;
			case 4:
				for(String s:list)
				{
					System.out.println(s);
				}
				break;
			
			case 5:
				System.out.println("Enter String  : ");
				str=sc.next();
				System.out.println("Enter Position  : ");
				int j=sc.nextInt();
				list.remove(j);
				list.add(j, str);
				break;
			case 6:
				Collections.sort(list);
				break;
		}
		}while(choice!=0);
	
		
		
	} 
}
