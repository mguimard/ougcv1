package ougcv1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Dates {

	public static void main(String[] args) {
		DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("YYYY / MMM / dd");
		String s = f2.format(LocalDate.now());
		System.out.println(s);
	}

	public static void main4(String[] args) {
		System.out.println(Period.of(1, 1, 1));
		System.out.println(Period.of(0, 0, 0));
		System.out.println(Period.of(0, 1, 0));
		System.out.println(Period.of(1, 0, 0));
		System.out.println(Period.of(1, 0, 1));
		System.out.println(Period.of(1, 1, 0));
		System.out.println(Period.of(0, 1, 1));
	}

	public static void main3(String[] args) {
		LocalDate now = LocalDate.now(); // 2025-05-14

		Period onMonth = Period.ofMonths(1);
		Duration oneHour = Duration.ofHours(1);

		LocalDate dansUnMois = now.plus(onMonth);

		now = now.minusDays(1);
		System.out.println(now); // 2025-05-14
	}

	public static void main2(String[] args) {

		LocalDate date; // jour, mois, année
		LocalTime time; // heure, minutes, secondes, nano
		LocalDateTime ldt; // both

		LocalDate now = LocalDate.now();
		System.out.println(now); // fonction de la Locale

		LocalTime now2 = LocalTime.now();
		System.out.println(now2);

		LocalDateTime now3 = LocalDateTime.now();
		System.out.println(now3);

		LocalDate x = LocalDate.of(2025, 4, 15);
		LocalDate.parse("2025-04-15");
		System.out.println(x);

	}

}
