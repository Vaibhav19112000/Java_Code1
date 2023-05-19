
public class ArrayDemo {
	public static void main(String []a)
	{
		int arr[]= new int[5];
		arr[0]=1;
		arr[1]=24;
		arr[2]=2;
		arr[3]=23;
		arr[4]=22;
		int res=max(arr);
		int res1=min(arr);
		System.out.println("maximum :: "+res);
		System.out.println("minimum :: "+res1);
		
	}
	public static int max(int a[])
	{
		int max=a[0];
		for(int i=1;i<5;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	public static int min(int a[])
	{
		int min=a[0];
		for(int i=1;i<5;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	

}
