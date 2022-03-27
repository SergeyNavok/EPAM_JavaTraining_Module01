package by.epam.module01.cycle;

/*
Найти сумму квадратов первых ста чисел. 
*/
public class Cycle03 {

	public static void main(String[] args) {
		int result;

		result = 0;

		for (int i = 1; i <= 100; i++) {
			result += i * i;
		}

		System.out.println("Sum of squares of the first 100 numeric values: " + result);
	}
}
