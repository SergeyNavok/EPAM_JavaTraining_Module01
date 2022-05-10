package by.epam.module01.linear;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((sin x + cos y) / (cos x − sin y)) * tg xy
*/
public class Linear03 {

	public static void main(String[] args) {
		double x;
		double y;
		double result;

		// Чаще всего sin и cos считаются от угла, хотя по условию это не сказано
		// x = Math.toRadians(x);
		// y = Math.toRadians(y);
		x = 60;
		y = 30;
		result = getFunctionValue(x, y);

		System.out.println("Result = " + result);
	}

	private static double getFunctionValue(double x, double y) {
		double numerator;
		double denominator;
		double value;
		double result;

		numerator = Math.sin(x) + Math.cos(y);
		denominator = Math.cos(x) - Math.sin(y);
		value = Math.tan(x * y);

		result = numerator / denominator * value;

		return result;
	}
}
