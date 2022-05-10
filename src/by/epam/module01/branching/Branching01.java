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
		checkTriangle(angle1, angle2);

		angle1 = 90;
		angle2 = 90;
		checkTriangle(angle1, angle2);

		angle1 = -10;
		angle2 = 89;
		checkTriangle(angle1, angle2);

		angle1 = 0;
		angle2 = 89;
		checkTriangle(angle1, angle2);

		angle1 = 10;
		angle2 = 89;
		checkTriangle(angle1, angle2);

		angle1 = 45;
		angle2 = 45;
		checkTriangle(angle1, angle2);
	}

	private static void checkTriangle(int angle1, int angle2) {
		System.out.println();
		System.out.println("Triangle with angles: " + angle1 + " and " + angle2);

		if (angle1 > 90 || angle1 < 1 || angle2 > 90 || angle2 < 1) {
			System.out.println("The angle of the triangle can range from 1 to 90 degrees!");
			return;
		}

		if (angle1 + angle2 >= 180) {
			System.out
					.println("The sum of the two angles of a triangle cannot be greater than or equal to 180 degrees!");
			return;
		}

		System.out.println("A triangle with given angles can exist.");

		if (angle1 == 90 || angle2 == 90 || 180 - angle1 - angle2 == 90) {
			System.out.println("This triangle is equilateral.");
		}
	}
}
