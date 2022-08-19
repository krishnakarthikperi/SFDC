package labExercises.lab6;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		System.out.println("Enter date in yyyy-MM-dd format");
		Scanner usrip = new Scanner(System.in);
		String str = usrip.nextLine();
		LocalDate date = LocalDate.parse(str);
		LocalDate now = LocalDate.now();
		Period duration = Period.between(date, now);
		System.out.println("Duration in days: "+ChronoUnit.DAYS.between(date, now));
		System.out.println("Duration in months: "+duration.toTotalMonths());
		System.out.println("Duration in years: "+duration.getYears());
		usrip.close();
	}
}
