package exception;

public class NoDataFoundException extends Exception{
	public NoDataFoundException(String str) {
		System.out.println("Not valid id... Please enter valid ID");
	}
}