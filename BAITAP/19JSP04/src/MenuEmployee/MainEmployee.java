package MenuEmployee;

import java.util.Scanner;

import Employee.Employee;
import Employee.Job;

public class MainEmployee {
	
	static Employee[] employeess = new Employee[100];


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Create employee");
		System.out.println("2. Show the existing employee");
		System.out.println("3. Exit");
		int inputNumber = 0;
		do {
		Scanner scannerInput = new Scanner(System.in);
		System.out.println("Please input a number : ");
		inputNumber = scannerInput.nextInt();
		System.out.println("Number : "+inputNumber);
		switch(inputNumber) {
		case 1:
			addEmployee();
			break;
		case 2:
			showEmployee();
			break;
		case 3:
			System.out.println("3. Exit");
			break;
		default:
			}
		}
		while (inputNumber !=3);
		
		
	}

	private static void showEmployee() {
		// TODO Auto-generated method stub
		System.out.println("STT       name         Salary         JobName");
		for(int i = 0; i<employeess.length;i++){
			System.out.println(employeess[i].id + "" + employeess[i].name + "" + employeess[i].Salary + "" + employeess[i].job+ "");
			
		}
	}

	private static void addEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many employee you want to add? : ");
		int n = scanner.nextInt();
		employeess = new Employee[n];
		// TODO Auto-generated method stub
		for(int i = 0; i< employeess.length; i++) {
		System.out.println("Please input for employee[" +(i+1) +"]");
		System.out.println("Name : ");
		Scanner scannerName = new Scanner(System.in);
		String name = scannerName.nextLine();
		System.out.println("Salary : ");
		double Salary = scanner.nextDouble();
		System.out.println("Age : ");
		int age = scanner.nextInt();
		System.out.println("Job name : ");
		String jobName = scanner.next();
		
		Employee employee = new Employee(name,(i + 1), Salary, age, new Job(i+name));
		employeess [i] = employee;
	}
	}
	
}
