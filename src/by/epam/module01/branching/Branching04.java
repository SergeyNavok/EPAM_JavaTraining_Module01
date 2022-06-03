package by.epam.module01.branching;

/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z  кирпича. 
Определить, пройдет ли кирпич через отверстие.
*/

public class Branching04 {

	public static void main(String[] args) {
		int holeX;
		int holeY;
		int brickX;
		int brickY;
		int brickZ;

		holeX = 2;
		holeY = 5;
		brickX = 2;
		brickY = 5;
		brickZ = 1;
		brickCheck(holeX, holeY, brickX, brickY, brickZ);

		holeX = 2;
		holeY = 5;
		brickX = 1;
		brickY = 10;
		brickZ = 1;
		brickCheck(holeX, holeY, brickX, brickY, brickZ);

		holeX = 2;
		holeY = 5;
		brickX = 2;
		brickY = 6;
		brickZ = 13;
		brickCheck(holeX, holeY, brickX, brickY, brickZ);
	}

	private static void brickCheck(int holeX, int holeY, int brickX, int brickY, int brickZ) {
		System.out.println();
		System.out.printf("Brick %2d*%2d*%2d ", brickX, brickY, brickZ);

		if (brickX <= holeX && brickY <= holeY) {
			System.out.printf("will go through the hole %d*%d", holeX, holeY);
			return;
		}

		if (brickX <= holeX && brickZ <= holeY) {
			System.out.printf("will go through the hole %d*%d", holeX, holeY);
			return;
		}

		if (brickY <= holeX && brickZ <= holeY) {
			System.out.printf("will go through the hole %d*%d", holeX, holeY);
			return;
		}

		System.out.printf("WILL NOT go through the hole %d*%d", holeX, holeY);
	}
}
