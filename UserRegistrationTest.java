package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistrationProblem uspTest;

	@Before
	public void classObject() {
		uspTest = new UserRegistrationProblem();
	}

	// UC-12 :- Refactor the Code to throw custom exceptions in case of Invalid User Details.
	
	@Test
	public void given_first_name_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.firstNameValidation.firstNameValidation("Rajendhar");
		assertEquals(true, output);

	}

	@Test
	public void given_first_name_expected_as_false() {
		try {
			boolean output = uspTest.firstNameValidation.firstNameValidation("rajendhar");
			assertEquals(false, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_last_name_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.lastNameValidation.lastNameValidation("Vemula");
		assertEquals(true, output);
	}

	@Test
	public void given_last_name_expected_as_false() {
		try {
			boolean output = uspTest.lastNameValidation.lastNameValidation("vemula");
			assertEquals(false, output);

		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_email__extpected_as_true() throws UserRegistrationException {
		boolean output = uspTest.emailValidation.emailValidation("vemulrajendhar1@gmail.com");
		assertEquals(true, output);
	}

	@Test
	public void given_email__extpected_as_false() {
		try {
			boolean output = uspTest.emailValidation.emailValidation("rajendhar@.gmail.com.com.");
			assertEquals(true, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_mobile_number_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.mobileNumberValidation.mobileNumberValidation("91 4532324523");
		assertEquals(true, output);
	}

	@Test
	public void given_mobile_number_expected_as_false() {
		try {
			boolean output = uspTest.mobileNumberValidation.mobileNumberValidation("914532324523");
			assertEquals(false, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_password_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.passwordValidation.passwordValidation("Rajendhar12@");
		assertEquals(true, output);
	}

	@Test
	public void given_password_expected_as_false() {
		try {
			boolean output = uspTest.passwordValidation.passwordValidation("Raja$l123@");
			assertEquals(false, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}
}