
public class Emp 
{
	private int eid;
	private String name;
	private double salary;
	private String deptName;
	static String dept[];
	static
	{
		dept=new String [5];
		dept[0]="Sale";
		dept[1]="Project";
		dept[2]="Admin";
		dept[3]="HR";
		dept[4]="Finance";
		
	}
	public Emp(int eid,String name,double salary,String deptName)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.deptName=deptName;
		boolean flag = true;
		for(int i=0;i<dept.length;i++)
		{
			if(deptName.equals(dept[i]))
			{
				this.deptName=deptName;
				flag=false;
			}
		}
		if(flag==true)
		{
			this.deptName="Training";
		}
		
	}
	public void display()
	{
		System.out.println("Employee id:: "+eid+"\nName:: "+name+"\nSalary:: "+salary+"\nDepartment:: "+deptName);
		System.out.println("----------------");
		
	}

}
