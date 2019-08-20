package MenuEmployee;

import Employee.Job;

public class Employee {
	public String name;
	public int id;
	public double Salary;
	public int age;
	public boolean Married;
	public Job job;
public Employee( int id,String name, double Salary, Job job) {
	this.id = id;	
	this.name = name;
	this.Salary = Salary;
	this.job = job;
}


}
