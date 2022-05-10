package by.epam.module01.cycle;

import java.util.Scanner;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. 
m и n вводятся с клавиатуры.
*/
public class Cycle07 {

	public static void main(String[] args) {
		final int SECOND_DIVIDER = 2;

		int startOfRow;
		int endOfRow;
		int temp;

		startOfRow = getPositiveIntegerFromConsole("Enter a natural number m:");
		endOfRow = getPositiveIntegerFromConsole("Enter a natural number n:");

		if (endOfRow < startOfRow) {
			temp = startOfRow;
			startOfRow = endOfRow;
			endOfRow = temp;
		}

		System.out.printf("The interval from %d to %d contains numbers:\n", startOfRow, endOfRow);

		for (int i = startOfRow; i <= endOfRow; i++) {
			System.out.println("Number " + i);

			for (int j = SECOND_DIVIDER; j < i; j++) {
				if (i % (double) j == 0) {
					System.out.println("	contains divisor:" + j);
				}
			}
		}
	}

	private static int getPositiveIntegerFromConsole(String message) {
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

		} while (value <= 0);

		return value;
	}

}
