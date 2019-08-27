package LABSUMMARY;

public class NhanVien extends CanBo {
	private String job;
	public NhanVien(String name, int year, String gender, String address) {
		super(name, year, gender, address);
		this.job = job;
		// TODO Auto-generated constructor stub
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "NhanVien [job=" + job + "]";
	}
	public NhanVien() {
		super();
	}
}
