package by.epam.module01.branching;

/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
и если да, то будет ли он прямоугольным.
*/

public class Branching01 {

	public static void main(String[] args) {
		int angle1;
		int angle2;

		angle1 = 10;
		angle2 = 89;
		printCheckTriangle(angle1, angle2);

		angle1 = 90;
		angle2 = 90;
		printCheckTriangle(angle1, angle2);

		angle1 = -10;
		angle2 = 89;
		printCheckTriangle(angle1, angle2);

		angle1 = 0;
		angle2 = 89;
		printCheckTriangle(angle1, angle2);

		angle1 = 10;
		angle2 = 89;
		printCheckTriangle(angle1, angle2);

		angle1 = 45;
		angle2 = 45;
		printCheckTriangle(angle1, angle2);
	}

	private static void printCheckTriangle(int angle1, int angle2) {
		final int MIN_ANGLE = 1;
		final int RIGHT_ANGLE = 90;
		final int ALL_ANGLE = 180;

		int thirdAngle;

		thirdAngle = ALL_ANGLE - angle1 - angle2;

		System.out.println();
		System.out.println("Triangle with angles: " + angle1 + " and " + angle2);

		if (angle1 > RIGHT_ANGLE || angle1 < MIN_ANGLE || angle2 > RIGHT_ANGLE || angle2 < MIN_ANGLE) {
			System.out.println("The angle of the triangle can range from 1 to 90 degrees!");
			return;
		}

		if (angle1 + angle2 >= ALL_ANGLE) {
			System.out.println(
					"The sum of the two angles of a triangle " + "cannot be greater than or equal to 180 degrees!");
			return;
		}

		System.out.println("A triangle with given angles can exist.");

		if (angle1 == RIGHT_ANGLE || angle2 == RIGHT_ANGLE || thirdAngle == RIGHT_ANGLE) {
			System.out.println("This triangle is equilateral.");
		}
	}
}
