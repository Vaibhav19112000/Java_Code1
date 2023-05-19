package books;


public class Book 
{
	static int cnt;
	private int bookid;
	private String title;
	private double price;
	
	public Book()
	{
		cnt++;
		bookid=cnt;
		title="NA";
		price=0;
		
	}
	public Book(String s , double p)
	{
		cnt++;
		bookid=cnt;
		this.title=s;
		this.price=p;
	}
	public void detail()
	{
		System.out.println("--------------------------------------------");
		System.out.println("Bookid :: "+bookid);
		System.out.println("Title :: "+title);
		System.out.println("Price :: "+price);
	}
	
	

}
