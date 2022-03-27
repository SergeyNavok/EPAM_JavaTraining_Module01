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
			System.out.printf("\nПри значении = %.2f, значение функции = %.2f", i, calculateFunction(i));
		}
	}

	public static double calculateFunction(double value) {
		double functionValueByCondition;

		functionValueByCondition = 2;

		if (value <= functionValueByCondition) {
			return -value;
		}

		return value;
	}
}
