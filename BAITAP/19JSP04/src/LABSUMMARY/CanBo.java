package LABSUMMARY;

public class CanBo {
	private String name;
	private int year;
	private String gender;
	private String address;
	public CanBo(String name, int year, String gender, String address) {
		super();
		this.name = name;
		this.year = year;
		this.gender = gender;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
