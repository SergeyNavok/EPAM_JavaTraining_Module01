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
		calculate(x);

		x = -2;
		calculate(x);
	}

	private static void calculate(double x) {
		double functionValue;
		double functionValueByCondition;

		functionValueByCondition = 3;

		if (x <= functionValueByCondition) {
			functionValue = Math.pow(x, 2) - 3 * x + 9;
		} else {
			functionValue = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("Function value at x(" + x + ") = " + functionValue);
	}
}
