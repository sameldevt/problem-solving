package br.com.samiac.problems.hackerrank;

public class DayOfTheProgrammer {

	public static String dayOfProgrammer(int year) {

		boolean isJulianCalendar = year < 1918;

		int februaryDays = 28, programmerDay = 256;

		int yearDays = (7 * 30) + 5 + februaryDays;
		int month = (programmerDay / 30) + 1;
		int day = programmerDay - yearDays;

		if (year == 1918) {
			return formatDate(day + 13, month, year);
		}

		if (isJulianCalendar) {

			if (year % 4 == 0) {
				day -= 1;
			}

			return formatDate(day, month, year);
		}

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			day -= 1;
		}

		return formatDate(day, month, year);
	}

	private static String formatDate(int day, int month, int year) {
		return (day < 10 ? "0" + day : day) + "." + (month < 10 ? "0" + month : month) + "." + year;
	}
}
