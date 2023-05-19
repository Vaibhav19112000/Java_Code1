
public class arrayAdd 
{
	private int c[];
	
	public int [] arrayAdd(int a[],int b[])
	{
		int k=0;
		c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int j=0;j<b.length;j++)
		{
			c[k]=b[j];
			k++;
		}
		return c;
		
	}
	public void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
	
	

}


