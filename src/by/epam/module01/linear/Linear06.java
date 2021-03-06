package by.epam.module01.linear;

/*
Для  данной  области  составить  линейную  программу,  которая  печатает  true,  
если  точка  с  координатами  (х,  у) принадлежит закрашенной области, 
и false — в противном случае:
*/

public class Linear06 {

	public static void main(String[] args) {
		int x;
		int y;

		x = 1;
		y = 1;
		printCoordinatesCheck(x, y);

		x = 10;
		y = -1;
		printCoordinatesCheck(x, y);
	}

	private static void printCoordinatesCheck(int x, int y) {
		boolean isBelongCoordinates;

		isBelongCoordinates = false;

		if (y >= 0 && y <= 4 && x >= -2 && x <= 2) {
			isBelongCoordinates = true;
		}

		if (y >= -3 && y < 0 && x >= -4 && x <= 4) {
			isBelongCoordinates = true;
		}

		System.out.println("Dot [" + x + "," + y + "] belongs to area? = " + isBelongCoordinates);
	}
}
