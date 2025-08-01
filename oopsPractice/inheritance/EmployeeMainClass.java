package inheritance;


class Employee
{
	public String empName;
	public int empId;
	public double empSal;
	
	public Employee(String empName, int empId, double empSal) 
	{
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
	}

	public void empDetails()
	{
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee salary : "+empSal);
	}
}
class Tester extends Employee
{
	public String testingRole;
	public Tester(String empName, int empId, double empSal, String testingRole) 
	{
		super(empName,empId,empSal);
		this.testingRole = testingRole;
	}


	public void testerDetails()
	{
		empDetails();
		System.out.println("testing role : "+testingRole);
	}
}
class Developer extends Employee
{
	public String programmingLang;
	
	
	public Developer(String empName, int empId, double empSal, String programmingLang) 
	{
		super(empName, empId, empSal);
		this.programmingLang = programmingLang;
	}


	public void developerDetails()
	{
		empDetails();
		System.out.println("Programming language : "+programmingLang);
	}
}

public class EmployeeMainClass 
{
	public static void main(String[] args) 
	{
		Developer raghu = new Developer("Raghunadan",101,40000,"java");
		raghu.empDetails();
		System.out.println("==========================================");
		Developer ravi = new Developer("Ravichandran",102,35000,"Python");
		ravi.empDetails();
		System.out.println("==========================================");
		Tester shruthi = new Tester("Shruthi",501,30000,"Automation");
		shruthi.empDetails();
		System.out.println("==========================================");
		Tester ramya = new Tester("Ramya",502,25000,"Manual");
		ramya.empDetails();
	}
}