package by.epam.module01.branching;

/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z  кирпича. 
Определить, пройдет ли кирпич через отверстие.
*/
public class Branching04 {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		int y;
		int z;

		a = 2;
		b = 5;
		x = 2;
		y = 5;
		z = 1;
		brickCheck(a, b, x, y, z);

		a = 2;
		b = 5;
		x = 1;
		y = 10;
		z = 1;
		brickCheck(a, b, x, y, z);

		a = 2;
		b = 5;
		x = 2;
		y = 6;
		z = 13;
		brickCheck(a, b, x, y, z);
	}

	private static void brickCheck(int a, int b, int x, int y, int z) {
		System.out.println();
		System.out.printf("Brick %2d*%2d*%2d ", x, y, z);

		if (x <= a && y <= b) {
			System.out.printf("will go through the hole %d*%d", a, b);
			return;
		}

		if (x <= a && z <= b) {
			System.out.printf("will go through the hole %d*%d", a, b);
			return;
		}

		if (y <= a && z <= b) {
			System.out.printf("will go through the hole %d*%d", a, b);
			return;
		}

		System.out.printf("WILL NOT go through the hole %d*%d", a, b);
	}
}
