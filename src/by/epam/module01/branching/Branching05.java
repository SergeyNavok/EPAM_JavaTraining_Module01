package by.epam.module01.branching;

/*
Вычислить значение функции:
F(x) = x(2) - 3x + 9, если x <= 3,
F(x) = 1 / (x^3 + 6), если x > 3
*/

public class Branching05 {

	public static void main(String[] args) {
		int x;

		x = 3;
		printCalculateFunction(x);

		x = -2;
		printCalculateFunction(x);
	}

	private static void printCalculateFunction(double value) {
		double result;
		double functionValue1;
		double functionValue2;
		double functionValueByCondition;

		functionValue1 = Math.pow(value, 2) - 3 * value + 9;
		functionValue2 = 1 / (Math.pow(value, 3) + 6);
		functionValueByCondition = 3;

		if (value <= functionValueByCondition) {
			result = functionValue1;
		} else {
			result = functionValue2;
		}

		System.out.println("Function value at (" + value + ") = " + result);
	}
}
