package com.generation.archive.test.model.entities;

import org.junit.jupiter.api.Test;

import com.generation.archive.model.entities.Date;

class DateTest
{

	@Test
	void testToString()
	{

		Date a = new Date(5, 2, 1980);
		
		assert(a.toString().equals("05/02/1980"));
	}
	
	@Test
	void testChristmasUSA()
	{

		Date xmas = new Date(25, 12, 2022);
		
		assert(xmas.toString().equals("25/12/2022"));
		assert(xmas.toUSA().equals("12-25-2022"));
	}
	
	@Test
	void testBdayUSA()
	{

		Date bday = new Date(5, 2, 1980);
		
		assert(bday.toString().equals("05/02/1980"));
		assert(bday.toUSA().equals("02-05-1980"));
	}

}
