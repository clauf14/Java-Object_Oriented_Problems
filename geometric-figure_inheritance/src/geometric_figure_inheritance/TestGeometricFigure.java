package geometric_figure_inheritance;

import java.util.ArrayList;

public class TestGeometricFigure { // ---------test class---------

	public static void main(String[] args) {
		GeometricFigure f1 = new GeometricFigure("Default Object", "blue");
		System.out.println(f1.toString());
		Circle c1 = new Circle("Circle 1", "red", 7);
		System.out.println(c1.toString());
		GeometricFigure c2 = new Circle("Circle 2", "white", 10);
		System.out.println(c2.toString());
		Rectangle d1 = new Rectangle("Rectangle 1", "yellow", 10, 2);
		System.out.println(d1.toString());
		Rectangle d2 = new Rectangle("Rectangle 2", "pink", 8, 4);
		System.out.println(d2.toString());
		ArrayList<GeometricFigure> List = new ArrayList<GeometricFigure>();
		List.add(f1);
		List.add(c1);
		List.add(c2);
		List.add(d1);
		List.add(d2);

		int nr = 0;
		for (int i = 0; i < List.size(); i++) {
			if (List.get(i).getColor().equals("red"))
				nr++;
		}
		System.out.println("Number of red geometric figures=" + nr);

		int nrCircle = 0;
		for (GeometricFigure f : List) {
			if (f instanceof Circle)
				nrCircle++;
		}
		System.out.println("Number of Circles=" + nrCircle);

		int nrRectangle = 0;
		for (int i = 0; i < List.size(); i++) {
			if (List.get(i) instanceof Rectangle)
				nrRectangle++;
		}
		System.out.println("Number of Rectangles=" + nrRectangle);

		System.out.println("\nSorting by area \n");
		GeometricFigure[] figures = new GeometricFigure[5];
		figures[0] = f1;
		figures[1] = c1;
		figures[2] = c2;
		figures[3] = d1;
		figures[4] = d2;
		int n = figures.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (figures[j].getArea() > figures[j + 1].getArea()) {
					GeometricFigure aux = figures[j];
					figures[j] = figures[j + 1];
					figures[j + 1] = aux;
				}
		for (int i = 0; i < n; i++)
			System.out.println(figures[i].getName() + " " + figures[i].getArea());

	}

}
