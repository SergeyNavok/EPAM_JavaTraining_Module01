package by.epam.module01.linear;

/*
Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
*/
public class Linear05 {

	public static void main(String[] args) {
		int t;

		t = 61;
		toTimeFormat(t);

		t = 3599;
		toTimeFormat(t);

		t = 3601;
		toTimeFormat(t);

		t = 13858;
		toTimeFormat(t);
	}

	public static void toTimeFormat(int value) {
		int second;
		int minute;
		int hour;

		second = value % 60;
		hour = value / 3600;
		minute = (value - second - hour * 3600) / 60;

		System.out.printf("%d second(s)\t- is %02dhour %02dmin %02dsec", value, hour, minute, second);
		System.out.println();
	}
}
