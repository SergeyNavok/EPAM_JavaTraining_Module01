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
		findSum(startOfRow, endOfRow, e);

		startOfRow = -3;
		endOfRow = 6;
		e = 3;
		findSum(startOfRow, endOfRow, e);
	}

	public static void findSum(int startOfRow, int endOfRow, int e) {
		int counter;
		double temp;
		double result;

		counter = 0;
		temp = 0;
		result = 0;

		for (int i = startOfRow; i <= endOfRow; i++) {
			temp = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));

			if (Math.abs(temp) >= e) {
				result += temp;
				counter++;
			}
		}

		System.out.printf("Условию соответствовали %d число(а) ряда, сумма = %.2f", counter, result);
		System.out.println();
	}
}
