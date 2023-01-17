package com.generation.archive.test.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.archive.util.Date;

@SuppressWarnings("unused")
class DateTest {

	@Test
	void testIsValid() {

		Date d1 = new Date(5, 2, 1980);
		Date d2 = new Date(29, 2, 2020);
		// non valide
		Date d3 = new Date(-3, -3, 1980);
		Date d4 = new Date(-3, 2, 1980);
		Date d5 = new Date(1, 13, 1980);

		assert (d1.isValid());
		assert (d2.isValid());

		assert (!d3.isValid());
		assert (!d4.isValid());
		assert (!d5.isValid());
	}

	@Test
	void testToITA() {
		Date d1 = new Date(5, 2, 1980);

		assert (d1.toITA().equals("05/02/1980"));
	}

	@Test
	void testToUSA() {
		Date d1 = new Date(5, 2, 1980);

		assert (d1.toUSA().equals("02/05/1980"));
	}

	@Test
	void testToDB() {
		Date d1 = new Date(5, 2, 1980);

		assert (d1.toDB().equals("1980/02/05"));
	}
}
