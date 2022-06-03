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
		double numeratorFunction;
		double denominatorFunction;
		double valueFunction1;
		double valueFunction2;
		double temp;
		double result;

		temp = Math.pow(b, 2) * 4 * a * c;
		numeratorFunction = b + Math.sqrt(temp);
		denominatorFunction = 2 * a;
		valueFunction1 = Math.pow(a, 3) * c;
		valueFunction2 = Math.pow(b, -2);

		result = numeratorFunction / denominatorFunction - valueFunction1 + valueFunction2;

		return result;
	}
}
