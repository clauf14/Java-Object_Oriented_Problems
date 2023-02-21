package geometric_figure_inheritance;

public class Rectangle extends GeometricFigure {// <--------subclass-------->

	private int width;
	private int length;

	public Rectangle(String name, String color, int width, int length) {
		super(name, color);
		this.width = width;
		this.length = length;
		this.area = areaCalculation();
		this.perimeter = perimeterCalculation();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double areaCalculation() {
		return width * length;
	}

	public double perimeterCalculation() {
		return 2 * length + 2 * width;
	}

	public String toString() {
		return super.toString() + ", width=" + width + ", length=" + length;
	}

}
