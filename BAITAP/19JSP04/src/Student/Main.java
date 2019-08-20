package Student;

public class Main {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		StudentClass studentclass1= new StudentClass("Dave","Boy",6);
		System.out.println("Information Student 1:");
		System.out.println("Name:" +studentclass1.name);
		System.out.println("Gender:" +studentclass1.gender);
		System.out.println("Age:" +studentclass1.age);
		StudentClass studentclass2= new StudentClass("Join","Boy",7);
		System.out.println("Information Student 2:");
		System.out.println("Name:" +studentclass2.name);
		System.out.println("Gender:" +studentclass2.gender);
		System.out.println("Age:" +studentclass2.age);
		StudentClass studentclass3= new StudentClass("Juli","Girl",6);
		System.out.println("Information Student 3:");
		System.out.println("Name:" +studentclass3.name);
		System.out.println("Gender:" +studentclass3.gender);
		System.out.println("Age:" +studentclass3.age);

	}

}
