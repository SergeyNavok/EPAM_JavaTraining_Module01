package by.epam.module01.cycle;

import java.util.Scanner;

/*
Напишите  программу,  где  пользователь  вводит любое  целое  положительное  число. 
А  программа  суммирует все числа от 1 до введенного пользователем числа.
*/
public class Cycle01 {

	public static void main(String[] args) {
		int userNumber;
		long result;

		userNumber = 0;
		result = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (userNumber < 1) {
			System.out.println("Enter a positive number:");

			if (sc.hasNextInt()) {
				userNumber = sc.nextInt();
			} else {
				sc.next();
			}
		}

		for (int i = 1; i <= userNumber; i++) {
			result += i;
		}

		System.out.println("Sum of numbers from 1 to " + userNumber + " = " + result);
	}
}
