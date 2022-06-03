package by.epam.module01.cycle;

/*
Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  
модуль  которых  больше  или  равен заданному е. Общий член ряда имеет вид:
        1     1
a(n) = --- + ---
       2^n   3^n
*/

public class Cycle05 {

	public static void main(String[] args) {
		int startOfRow;
		int endOfRow;
		int e;

		startOfRow = 0;
		endOfRow = 6;
		e = 2;
		printFunctionValue(startOfRow, endOfRow, e);

		startOfRow = -3;
		endOfRow = 6;
		e = 3;
		printFunctionValue(startOfRow, endOfRow, e);
	}

	private static void printFunctionValue(int startOfRow, int endOfRow, int e) {
		int counter;
		double function;
		double result;

		counter = 0;
		result = 0;

		for (int i = startOfRow; i <= endOfRow; i++) {
			function = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));

			if (Math.abs(function) >= e) {
				result += function;
				counter++;
			}
		}

		System.out.printf("The condition was matched by %d number(s) in the range, sum = %.2f", counter, result);
		System.out.println();
	}
}
