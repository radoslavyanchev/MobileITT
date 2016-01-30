
public class NotValidParameterException extends Exception {

	private static final long serialVersionUID = -1300395845395108245L;

	public NotValidParameterException() {
		super();
	}

	public NotValidParameterException(String message, Throwable cause) {
		super(message, cause);

	}

	public NotValidParameterException(String text) {
		super(text);

	}

	public NotValidParameterException(Throwable cause) {
		super(cause);
	}

}
