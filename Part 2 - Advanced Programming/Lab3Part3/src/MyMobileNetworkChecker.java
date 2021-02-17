/**
 * @author linyu
 *
 */

//Custom exception declaration.
class NotMyNetworkException extends Exception 
{

	private static final long serialVersionUID = 1L;

	public NotMyNetworkException(String message) {
		super(message); 
	}
}

public class MyMobileNetworkChecker {
	
	//Network name String variable as a check standard.
	public static String myNetwork = "Three";
	
	/**
	 * @param inputNetwork
	 * @return
	 * @throws NotMyNetworkException
	 */
	//Check if inputNetwork = myNetwork(standard). If not, throw exception.
	public static String checkMyMobileNetwork(String inputNetwork) throws NotMyNetworkException {
		
		//Check.
		if(inputNetwork.equals(myNetwork)) {
			System.out.println("Correct network name.");
		}
		//Throw.
		else {
			throw new NotMyNetworkException("Network name incorrect error.");
		} 
        //Return.
		return inputNetwork;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Call method with a String as "inputNetwork".
		try {
			checkMyMobileNetwork("Three");		
		}
		//Catch exception if there's one.
		catch(NotMyNetworkException e) {
			System.out.println("Incorrect network name.");
			e.printStackTrace();
		}
	}
}