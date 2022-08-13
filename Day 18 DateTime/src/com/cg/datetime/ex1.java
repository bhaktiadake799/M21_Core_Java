package com.cg.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ex1 {

	public static void main(String[] args) {
		LocalDate l = LocalDate.now();
		System.out.println(l);
		LocalTime t = LocalTime.now();
		System.out.println(t);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		LocalDate d = LocalDate.of(2022, Month.OCTOBER, 7);
		System.out.println(d);
	}
}