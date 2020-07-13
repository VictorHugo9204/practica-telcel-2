package mx.com.telcel.practica.exception;

public class TelcelException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TelcelException(String messageString) {
		super(messageString);
	}

}
