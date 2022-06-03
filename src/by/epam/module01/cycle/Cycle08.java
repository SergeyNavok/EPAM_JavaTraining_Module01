package by.epam.module01.cycle;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
*/

public class Cycle08 {

	public static void main(String[] args) {
		int number;

		number = 12345;
		checkNumber(number);

		number = -987650043;
		checkNumber(number);
	}

	private static void checkNumber(int number) {
		final int ZERO = 0;
		final int TEN = 10;

		int copyNumber;
		int value;

		copyNumber = Math.abs(number);
		value = 0;

		System.out.println("The number " + number + " consists of the following numbers: ");

		while (copyNumber != ZERO) {
			value *= TEN;
			value += copyNumber % TEN;
			copyNumber /= TEN;
		}

		while (value != ZERO) {
			copyNumber = value % TEN;
			value /= TEN;

			System.out.printf("%d, ", copyNumber);
		}

		System.out.println();
	}
}
