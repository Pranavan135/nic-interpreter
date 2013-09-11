package cse.maven.sample;

public class Person {
	private long nicNumber;
	private int year;
	private int month;
	private int date;
	private String gender;
	private boolean isVoter;

	

	public long getNicNumber() {
		return nicNumber;
	}

	public void setNicNumber(long nicNumber) {
		this.nicNumber = nicNumber;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isVoter() {
		return isVoter;
	}

	public void setVoter(boolean isVoter) {
		this.isVoter = isVoter;
	}

}
