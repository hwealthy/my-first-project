package Employee;

import java.util.Scanner;

public class MainEmployee {
	

	public static void main(String[] args) {
		Job job1 = new Job("");
		Job job2 = new Job("");
		Job job3 = new Job("");
		Job job4 = new Job("");
		Job job5 = new Job("");


		int id = 0;
		String name = null;
		double Salary = 0;
		Employee employee1 = new Employee(id,name,Salary, job1);
		Employee employee2 = new Employee(id,name,Salary, job2);
		Employee employee3 = new Employee(id,name,Salary, job3);
		Employee employee4 = new Employee(id,name,Salary, job4);
		Employee employee5 = new Employee(id,name,Salary, job5);

		/*System.out.println("ID : " +employee1.id);
		System.out.println("Name : " +employee1.name);
		System.out.println("Salary : " +employee1.Salary);
		System.out.println("Job Name : " +employee1.job.name);*/

//mảng
		Employee[] employeeArray = new Employee[5];
		employeeArray[0] = employee1;
		employeeArray[1] = employee2;
		employeeArray[2] = employee3;
		employeeArray[3] = employee4;
		employeeArray[4] = employee5;
		/*int length = employeeArray.length;
		System.out.println("IB:" +employeeArray[length - 1].id);
		System.out.println("IB:" +employeeArray[length - 1].name);
		System.out.println("IB:" +employeeArray[length - 1].Salary);
		System.out.println("IB:" +employeeArray[length - 1].job.name);*/

		Scanner input = new Scanner(System.in);
	    System.out.println("Thông tin");
	    employeeArray[0].id = input.nextInt();
    	System.out.println("ID:" + employee1.id);
    	
    	
    	employeeArray[0].name = input.nextLine();
    	System.out.println("Name: "+employee1.name);
    	
    	employeeArray[0].Salary = input.nextDouble();
    	System.out.println("Salary: "+employee1.Salary);
    	
    	employeeArray[0].job.name = input.nextLine();
    	System.out.println("Job Name: " +employee1.job.name);

    	
    	




	} 

}
