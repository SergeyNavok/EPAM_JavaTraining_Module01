package by.epam.module01.cycle;

/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
*/

public class Cycle04 {

	public static void main(String[] args) {
		int i;
		int maxNumber;
		int errorValue;
		long result;
		long temp;

		i = 1;
		maxNumber = 200;
		errorValue = 0;
		result = 1;

		while (i <= maxNumber) {
			temp = i * i * result;

			if (temp == errorValue) {
				break;
			}

			result = temp;
			i++;
		}

		System.out.println("The maximum value for the 'long' type is reached on the product of squares of " + i
				+ " numbers, and is = " + result);
	}
}
