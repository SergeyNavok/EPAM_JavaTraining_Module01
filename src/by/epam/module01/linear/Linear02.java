package by.epam.module01.linear;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
      __________
b + \/ b^2 + 4ac
---------------- - a^3c + b^-2
        2a
*/
public class Linear02 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double result;

		a = 1;
		b = 4;
		c = 4;
		result = getFunctionValue(a, b, c);

		System.out.println("Function value = " + result);

		a = 2;
		b = 3;
		c = 1;
		result = getFunctionValue(a, b, c);

		System.out.println("Function value = " + result);
	}

	private static double getFunctionValue(double a, double b, double c) {
		double numerator;
		double denominator;
		double value1;
		double value2;
		double temp;
		double result;

		temp = Math.pow(b, 2) * 4 * a * c;
		numerator = b + Math.sqrt(temp);
		denominator = 2 * a;
		value1 = Math.pow(a, 3) * c;
		value2 = Math.pow(b, -2);

		result = numerator / denominator - value1 + value2;

		return result;
	}
}
