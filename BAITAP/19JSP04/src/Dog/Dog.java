package Dog;

public class Dog {
	public String name;
	public int age;
	public String color;
	public Dog(String name,int age,String color)
	{
		this.setName(name);
		this.setAge(age);
		this.setColor(color);
	}
	public static String wagging(String a) {
		return a;
	}
	public static String barking(String b) {
		return b;
	}
	public static String eating(String c) {
		return c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}