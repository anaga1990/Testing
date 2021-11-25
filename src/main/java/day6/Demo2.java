package day6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo2 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate fetureDate = date.plusDays(7);
		System.out.println(fetureDate);
		DateTimeFormatter dd = DateTimeFormatter.ofPattern("MMM YYYY");
		String ss = dd.format(fetureDate);
		System.out.println(ss);
		LocalDate month = date.plusMonths(3);
		LocalDate nemonth = date.minusMonths(5);
		LocalDate lessYe = date.minusYears(5);
		LocalDate lessweek = date.minusWeeks(5);
		LocalDate lessday = date.minusDays(5);
		System.out.println(month);
		System.out.println(nemonth);
		System.out.println(lessYe);
		System.out.println(lessweek);
		System.out.println(lessday);
		lessweek = date.minusWeeks(1);
		System.out.println(lessweek);
	}
}
