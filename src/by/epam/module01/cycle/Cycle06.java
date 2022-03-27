package by.epam.module01.cycle;

/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
*/
public class Cycle06 {

	public static void main(String[] args) {
		char firstChar;
		char lastChar;

		firstChar = '0';
		lastChar = 'z';

		for (int i = firstChar; i <= lastChar; i++) {
			System.out.println("Character <" + (char) i + "> matches encoding " + i);
		}
	}
}
