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

	public static void checkTriangle(int angle1, int angle2) {
		System.out.println("\nТреугольник с углами: " + angle1 + " и " + angle2);

		if (angle1 > 90 || angle1 < 1 || angle2 > 90 || angle2 < 1) {
			System.out.println("Угол треугольника может быть в диапазоне от 1 до 90 град.");
			return;
		}

		if (angle1 + angle2 >= 180) {
			System.out.println("Сумма углов треугольника не может быть равна или быть более 180 град.");
			return;
		}

		System.out.println("Треугольник с заданными углами может существовать");

		if (angle1 == 90 || angle2 == 90 || 180 - angle1 - angle2 == 90) {
			System.out.println("Этот треугольник является равносторонним");
		}
	}
}
