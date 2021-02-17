package exceptions;


/**
 * @author linyu
 *
 */

//The exception itself.
public class MaxWindException extends Exception {

	private static final long serialVersionUID = 1L;

	public MaxWindException(String message) {
		super(message); 
	}
}
