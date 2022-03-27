package by.epam.module01.linear;

/*
Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
*/
public class Linear01 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double result;

		a = 4;
		b = 2;
		c = 3;
		result = getFunctionValue(a, b, c);

		System.out.println("Function value = " + result);

		a = 5.2;
		b = 1;
		c = 3;
		result = getFunctionValue(a, b, c);

		System.out.println("Function value = " + result);
	}

	public static double getFunctionValue(double a, double b, double c) {
		double value;

		value = ((a - 3) * b / 2.0) + c;

		return value;
	}
}
