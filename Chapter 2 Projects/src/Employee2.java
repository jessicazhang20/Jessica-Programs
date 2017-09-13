
public class Employee2
{
	public Employee2()
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
	
	public double raiseSalary (double byPercent)
	{
		double newSalary = salary * (1 + byPercent / 100);
		salary = newSalary;
		return salary;
	}
	
	public String name;
	public double salary;
}
