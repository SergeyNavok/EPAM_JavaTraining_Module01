package by.epam.module01.linear;

/*
Дано действительное число R  вида nnn.ddd  (три цифровых разряда в дробной и целой частях). 
Поменять местами дробную и целую части числа и вывести полученное значение числа.
*/
public class Linear04 {

	public static void main(String[] args) {
		double r;

		r = 222.111;
		swapNumber(r);

		r = -111.999;
		swapNumber(r);

		r = 898.989;
		swapNumber(r);
	}

	private static void swapNumber(double value) {
		int wholePart;
		int residue;
		double temp;

		temp = Math.abs(value);
		wholePart = (int) temp;
		temp = temp % 1;

		// Если не делать округление, то идет потеря точности в вычислениях
		residue = (int) Math.round(temp * 1000);

		temp = residue + wholePart / 1000.0;

		System.out.println("Old value= " + value + ", new value= " + temp);
	}
}
