package by.epam.module01.branching;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
Определить, будут ли они расположены на одной прямой.
*/
public class Branching03 {

	public static void main(String[] args) {
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;

		x1 = 1;
		y1 = 2;
		x2 = 2;
		y2 = 4;
		x3 = 4;
		y3 = 8;
		checkingCoordinatesDots(x1, y1, x2, y2, x3, y3);

		x1 = 1;
		y1 = 2;
		x2 = 2;
		y2 = 4;
		x3 = 4;
		y3 = 3;
		checkingCoordinatesDots(x1, y1, x2, y2, x3, y3);
	}

	private static void checkingCoordinatesDots(double x1, double y1, double x2, double y2, double x3, double y3) {
		boolean result;

		result = (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);

		System.out.printf("Points A(%.0f,%.0f), B(%.0f,%.0f), C(%.0f,%.0f): ", x1, y1, x2, y2, x3, y3);

		if (result) {
			System.out.println("lie on the same line.");
		} else {
			System.out.println("are NOT on the same line.");
		}
	}

}
