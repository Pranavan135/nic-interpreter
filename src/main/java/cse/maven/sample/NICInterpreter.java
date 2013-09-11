package cse.maven.sample;

import java.util.Calendar;

import cse.maven.sample.exception.InvalidNicNumberException;


public class NICInterpreter {
	private Person person;

	public Person getDetails(String nic) throws InvalidNicNumberException {
		if (person == null) {
			person = new Person();
		}

		if (nic == null || nic.length() != 10) {
			throw new InvalidNicNumberException(nic);
		}

		String gender = "MALE";
		String days = nic.substring(2, 5);
		boolean isVoter = false;
		Calendar c = Calendar.getInstance();
		int year = 1900 + Integer.parseInt(nic.substring(0, 2));
		int days1 = Integer.parseInt(days);

		if (days1 > 500) {
			days1 = days1 - 500;
			gender = "FEMALE";
		}
		
		if (nic.charAt(9) == 'v' || nic.charAt(9) == 'V' )
			isVoter = true;
		
		c.set(c.DAY_OF_YEAR, days1);
		int month = c.get(c.MONTH) + 1;
		int mydate = c.get(c.DATE) - 1;
		person.setYear(year);
		person.setMonth(month);
		person.setDate(mydate);
		person.setGender(gender);
		person.setVoter(isVoter);
		return person;
	}

}
