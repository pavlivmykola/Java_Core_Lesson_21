package ua.lviv.lgs.maximum;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		Instant instant = date.toInstant();
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		LocalDate ld = zdt.toLocalDate();
		System.out.println(ld);
		LocalTime lt = zdt.toLocalTime();
		System.out.println(lt);
		LocalDateTime ldt = zdt.toLocalDateTime();
		System.out.println(ldt);

	}

}
