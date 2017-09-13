
public class Employee 
{
	public Employee()
	{
		name = "";
		salary = 0;
	}
			
	public void setName(String N)
	{
		name = N;
	}
	
	public void setSalary(double amount)
	{
		salary = amount;
	}
	
	public String getName( )
	{
		return name;
	}
	
	public double getSalary( )
	{
		return salary;
	}
	
	
	public String name;
	public double salary;
}
