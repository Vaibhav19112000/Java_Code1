
public class arrayDemo 
{
	public static void main(String[] args)
	{
		int a[]=new int [4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		
		int b[]=new int [5];
		b[0]=14;
		b[1]=24;
		b[2]=34;
		b[3]=44;
		b[4]=34;
		
		arrayAdd g= new arrayAdd();
		
		
		int c[]= new int[a.length+b.length];
		c = g.arrayAdd(a,b);
		
		g.display(c);
		
		
		
		
	}



}
