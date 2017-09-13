
public class Employee2Test {

	public static void main(String[] args) 
	{
		
		Employee2 harry = new Employee2();
		harry.setName("Harry");
		harry.setSalary(55000.0);
		
		System.out.println("Employee 1: ");
		System.out.println(" Name: " + harry.getName());
		System.out.println(" Salary: " + harry.getSalary());
		System.out.println(" After Raise: " + harry.raiseSalary(10));

		
	}

}
