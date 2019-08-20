package LAP3;

public abstract class Shape {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Triangle [color=" + color + "]";
	}
}
