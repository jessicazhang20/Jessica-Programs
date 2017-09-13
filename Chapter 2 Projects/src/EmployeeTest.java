// name employees and list their salaries 

public class EmployeeTest 
{
	public static void main(String[] args)
	{
		
	Employee num1 = new Employee();
	num1.setName("John Doe");
	num1.setSalary(0.0);
	
	System.out.println("Employee 1: ");
	System.out.println(" Name: " + num1.getName());
	System.out.println(" Salary: " + num1.getSalary());
	
	System.out.println("");
	
	Employee num2 = new Employee();
	num2.setName("Horatio Hornblower");
	num2.setSalary(80000.0);
	
	System.out.println("Employee 2: ");
	System.out.println(" Name: " + num2.getName());
	System.out.println(" Salary: " + num2.getSalary());
	
		
		
		
	}
}
