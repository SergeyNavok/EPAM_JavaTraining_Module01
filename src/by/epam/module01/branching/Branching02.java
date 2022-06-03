package by.epam.module01.branching;

/*
Найти max{min(a, b), min(c, d)}
*/

public class Branching02 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;

		a = 1;
		b = 2;
		c = 3;
		d = 4;
		printMaxOfTheMin(a, b, c, d);

		a = 12;
		b = 9;
		c = 0;
		d = -22;
		printMaxOfTheMin(a, b, c, d);
	}

	private static void printMaxOfTheMin(int x1, int x2, int y1, int y2) {
		int xMin;
		int yMin;

		xMin = x1 < x2 ? x1 : x2;
		yMin = y1 < y2 ? y1 : y2;

		System.out.printf("In set max{min(%d, %d), min(%d, %d)} - ", x1, x2, y1, y2);

		if (xMin > yMin) {
			System.out.printf("largest of the smallest %d", xMin);
		} else {
			System.out.printf("largest of the smallest %d", yMin);
		}

		System.out.println();
	}
}
