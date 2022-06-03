package by.epam.module01.cycle;

import java.util.Scanner;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. 
m и n вводятся с клавиатуры.
*/

public class Cycle07 {

	public static void main(String[] args) {
		final int ZERO = 0;
		final int SECOND_DIVIDER = 2;

		int startOfRow;
		int endOfRow;
		int tempValue;

		startOfRow = getPositiveIntegerFromConsole("Enter a natural number m:");
		endOfRow = getPositiveIntegerFromConsole("Enter a natural number n:");

		if (endOfRow < startOfRow) {
			tempValue = startOfRow;
			startOfRow = endOfRow;
			endOfRow = tempValue;
		}

		System.out.printf("The interval from %d to %d contains numbers:\n", startOfRow, endOfRow);

		for (int i = startOfRow; i <= endOfRow; i++) {
			System.out.println("Number " + i);

			for (int j = SECOND_DIVIDER; j < i; j++) {
				if (i % (double) j == ZERO) {
					System.out.println("	contains divisor:" + j);
				}
			}
		}
	}

	private static int getPositiveIntegerFromConsole(String message) {
		final int ZERO = 0;

		int value;

		value = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(message);

			if (sc.hasNextInt()) {
				value = sc.nextInt();
			} else {
				sc.next();
			}

		} while (value <= ZERO);

		return value;
	}
}
