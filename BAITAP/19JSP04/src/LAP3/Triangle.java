package LAP3;

public abstract class Triangle {
	private int base;
	private int height;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	public double Area()	{
		return 0.5 * base * height;
	}
	
}
