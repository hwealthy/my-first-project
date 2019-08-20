package Dog;

public class Main {
	public static void main(String argr[]) {
		 String a="vay duoi";
		 String b="sua";
		 String c="an";
		Dog dog1= new Dog("Mic",2,"Grey");
		Dog dog2= new Dog("Lu",5,"green");
		Dog dog3= new Dog("Mic",2,"yellow");
		
		System.out.println("Dog1\nName:"+dog1.getName()+"\nAge:"+dog1.getAge()+"\nGender:"+dog1.getColor()+"\nBehaviours:"+dog1.eating(a));
		System.out.println("Dog2\nName:"+dog2.getName()+"\nAge:"+dog2.getAge()+"\nGender:"+dog2.getColor()+"\nBehaviours:"+dog2.wagging(c));
		System.out.println("Dog3\nName:"+dog3.getName()+"\nAge:"+dog3.getAge()+"\nGender:"+dog3.getColor()+"\nBehaviours:"+dog3.wagging(b));
	}
	
}