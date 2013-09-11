package cse.maven.sample.exception;

public class InvalidNicNumberException extends Exception {

	public InvalidNicNumberException(String nic) {
		super("Invalid NIC number is entered " + nic);
	}
}
