package by.epam.module01.cycle;

/*
Вычислить значения функции на отрезке [а,b] c шагом h:
y = x, x > 2
y = -x, x <= 2
*/
public class Cycle02 {

	public static void main(String[] args) {
		double startOfSegment;
		double endOfSegment;
		double functionStep;

		startOfSegment = 1;
		endOfSegment = 3;
		functionStep = 0.2;

		for (double i = startOfSegment; i <= endOfSegment; i += functionStep) {
			System.out.printf("With value = %.2f, function value is %.2f", i, calculateFunction(i));
			System.out.println();
		}
	}

	private static double calculateFunction(double value) {
		double functionValueByCondition;

		functionValueByCondition = 2;

		if (value <= functionValueByCondition) {
			value = value * -1;
		}

		return value;
	}
}
