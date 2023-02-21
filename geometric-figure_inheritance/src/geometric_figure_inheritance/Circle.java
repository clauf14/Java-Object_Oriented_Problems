package geometric_figure_inheritance;

public class Circle extends GeometricFigure { // <--------subclass-------->

	public int radius;

	public Circle(String denumire, String culoare, int radius) {
		super(denumire, culoare);
		this.radius = radius;
		this.area = areaCalculation();
		this.perimeter = perimeterCalculation();

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	private double areaCalculation() {
		return Math.PI * Math.pow(radius, 2);
	}

	private double perimeterCalculation() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return super.toString() + ", radius=" + radius;
	}

}
