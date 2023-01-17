package com.generation.archive.test.util;

import org.junit.jupiter.api.Test;

import com.generation.archive.util.Date;
import com.generation.archive.util.Password;

class PasswordTest {

	@Test
	void testPasswords() {
		Date d = new Date(16, 1, 2023);

		Password good = new Password("CiaoMamma666", d);
		assert (good.isValid());

		/*
		 * creare una password di 5 caratteri con numeri e maiuscole e minuscole,
		 * chiamarla "tooShort" testarla: cosa deve dare? creare una password lunga 10
		 * di sole lettere minuscole testarla. La chiamate "onlyLowerCase" creare una
		 * password lunga 10 di sole lettere maiuscole chiamarla "onlyUpperCase" creare
		 * una password di soli NUMERI lunga 10 chiamarla onlyNumbers e testarla creare
		 * una password lunga 10 con .... fate tutte le casistiche
		 */

		Password tooShort = new Password("gian5", d);
		assert (!tooShort.isValid());

		Password onlyLowerCase = new Password("ffffffffff", d);
		assert (!onlyLowerCase.isValid());

		Password onlyUpperCase = new Password("FORZATURIN", d);
		assert (!onlyUpperCase.isValid());

		Password onlyNumbers = new Password("1234567890", d);
		assert (!onlyNumbers.isValid());
	}

}
