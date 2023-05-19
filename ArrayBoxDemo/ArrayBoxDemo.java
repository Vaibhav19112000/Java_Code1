
public class ArrayBoxDemo
{
	public static void main(String []args)
	{
		ArrayBox a[]=new ArrayBox[3];
		a[0]=new ArrayBox(12,11,2);
		a[1]=new ArrayBox();
		a[2]=new ArrayBox(12,16,2);
		for(ArrayBox x:a)
		{
			x.calVolume();
		}
		
	}

}
