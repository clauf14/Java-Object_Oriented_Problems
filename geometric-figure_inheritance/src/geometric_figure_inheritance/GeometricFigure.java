package geometric_figure_inheritance;

public class GeometricFigure { // <--------superclass-------->

	private String name;
	private String color;
	protected double area;
	protected double perimeter;

	public GeometricFigure(String name, String color) { // constructor
		this.name = name;
		this.color = color;
	}
	// -------------------------getter and setter----------------//

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	// ----------------------------------toString()
	public String toString() {
		if (area == 0 || perimeter == 0)
			return name + " " + color;
		else
			return name + ", " + color + ", " + "area=" + area + ", perimeter=" + perimeter;

	}
}
