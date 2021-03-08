package employeeapp;

public class Employee 
{
	//Fields / what they know
		//state of an object
		//  current values of the feilds
	private static int maxId = 0;
	private int id; // 1 -55 68 0 (primitive)
	private String fname; // Catherine char(<- base data type) String is calss so it must be caplitilized
	private String lname; // Radin
	private double salary; // 1.10 -33.43 0.0 68.9 (primitive)
	private boolean has401K;
	private int companyId;
	private int healthPlanId;

	//Behaviors  / methods -- what can it do? / must have () to become a method
		//constructor (is a method)
	// this refers to the feild~

	public Employee(String fname, String lname, double salary, boolean has401K, int companyId, int healthPlanId)
	{
		maxId++;
		id = maxId;

		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.has401K = has401K;
		this.companyId = companyId;
		this.healthPlanId = healthPlanId;
	}

	//Getters and Setters (setters will have void / meaning they dont return anything. Just manipulate)
	public int getId()
	{
		return id;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String)
	{
 		this.lname = lname;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public boolean getHas401K()
	{
		return has401K;
	}
	public void setHas401K(boolean has401K)
	{
		this.has401K = has401K
	}
	public int getCompanyId()
	{
		return companyId;
	}
	public void setCompanyId(int companyId)
	{
		this.companyId = companyId;
	}
	public int getHealthPlanId()
	{
		return healthPlanId;
	}
	public void setHelthPlanId(int healthPlanId)
	{
		this.healthPlanId = healthPlanId;
	}

} //class ending