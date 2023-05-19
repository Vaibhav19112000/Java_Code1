
public class ArrayBox 
{
	int wdth,dpth,ht;
	public ArrayBox()
	{
		this.wdth=12;
		this.dpth=1;
		this.ht=2;
	}
	public ArrayBox(int w,int d, int h)
	{
		this.wdth=w;
		this.dpth=d;
		this.ht=h;
	}
	public void calVolume()
	{
		int vol=wdth*dpth*ht;
		System.out.println("Volume :: "+vol);
	}

}
