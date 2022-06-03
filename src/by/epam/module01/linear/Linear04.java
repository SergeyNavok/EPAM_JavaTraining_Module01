package by.epam.module01.linear;

/*
Дано действительное число R  вида nnn.ddd  (три цифровых разряда в дробной и целой частях). 
Поменять местами дробную и целую части числа и вывести полученное значение числа.
*/

public class Linear04 {

	public static void main(String[] args) {
		double number;

		number = 222.111;
		printSwapNumber(number);

		number = -111.999;
		printSwapNumber(number);

		number = 898.989;
		printSwapNumber(number);
	}

	private static void printSwapNumber(double value) {
		double oneThousand;
		double temp;

		oneThousand = 1000;
		temp = Math.abs(value);

		int wholePart;
		int residue;

		wholePart = (int) temp;
		temp = temp % 1;

		// Т.к. по условию модуля нельзя использовать классы-оболочки -
		// необходимо делать округление, иначе идет потеря точности в вычислениях типа
		// double
		residue = (int) Math.round(temp * oneThousand);

		temp = residue + wholePart / oneThousand;

		System.out.println("Old value= " + value + ", new value= " + temp);
	}
}
