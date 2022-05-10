package by.epam.module01.cycle;

/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
*/
public class Cycle04 {

	public static void main(String[] args) {
		int i;
		long result;
		long temp;

		i = 1;
		result = 1;

		while (i <= 200) {
			temp = i * i * result;

			if (temp == 0) {
				break;
			}

			result = temp;
			i++;
		}

		System.out.println("The maximum value for the 'long' type is reached on the product of squares of " + i
				+ " numbers, and is = " + result);
	}
}
