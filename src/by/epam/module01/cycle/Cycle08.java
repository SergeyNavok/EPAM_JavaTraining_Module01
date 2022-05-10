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
		int value;
		int reverseValue;

		reverseValue = 0;
		value = Math.abs(number);

		System.out.println("The number " + number + " consists of the following numbers: ");

		while (value != 0) {
			reverseValue *= 10;
			reverseValue += value % 10;
			value /= 10;
		}

		while (reverseValue != 0) {
			value = reverseValue % 10;
			reverseValue /= 10;

			System.out.printf("%d, ", value);
		}

		System.out.println();
	}
}
