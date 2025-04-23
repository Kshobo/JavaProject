package Package.java;

public class Job {
	
	private double salary;
	private String role;
	private int jobID;
	String[] fileRoles;
	int j = 0;
	
	public Job (double salary, String role, int jobID)
	{
		setSalary(salary);
		setRole(role);
		setjobID(jobID);
	}
	
	//Getter for salary
	public double getSalary() 
	{
		return salary;
	}
	//Setter for Salary
	public void setSalary(double salary) {
		if (salary > 0 && salary <100000)
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("Invalid Salary");
		}
	}

	//Getter for role
	public String getRole() {
		return role;
	}
	//Setter for role
	public void setRole(String role) {
		this.role = role;
		
		FileProcessor fw = new FileProcessor("roles.txt");
		fw.openFile();
		fileRoles = fw.readFile();	
		while (j< 10)
		{
			if (role == fileRoles[j]);
			{
				System.out.println("Valid work role");
			}
			//{
				//System.out.println("Not valid work role");
			//}
		}
	}

	//Getter for jobID
	public int getjobID() {
		return jobID;
	}
	//Setter for jobID
	
	public void setjobID(int jobID) {
			this.jobID = jobID;
	}
	
}
