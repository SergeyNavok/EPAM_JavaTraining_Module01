package by.epam.module01.linear;

/*
Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
*/

public class Linear05 {

	public static void main(String[] args) {
		int timeSec;

		timeSec = 61;
		printTimeFormat(timeSec);

		timeSec = 3599;
		printTimeFormat(timeSec);

		timeSec = 3601;
		printTimeFormat(timeSec);

		timeSec = 13858;
		printTimeFormat(timeSec);
	}

	private static void printTimeFormat(int value) {
		final int SECONDS_IN_MINUTE = 60;
		final int SECONDS_IN_HOUR = 3600;
		final int MINUTES_IN_HOUR = 60;

		int second;
		int minute;
		int hour;

		second = value % SECONDS_IN_MINUTE;
		hour = value / SECONDS_IN_HOUR;
		minute = value - second - (hour * SECONDS_IN_HOUR);
		minute /= MINUTES_IN_HOUR;

		System.out.printf("%d second(s)\t- is %02d hour %02d min %02d sec", value, hour, minute, second);
		System.out.println();
	}
}
