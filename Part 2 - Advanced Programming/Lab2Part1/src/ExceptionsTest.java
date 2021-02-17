/**
 * @author linyu
 *
 */
public class ExceptionsTest{
	
	/**
	 * @param args
	 */
	public static void main(String args[]){
	   
		try{
    	  
			int num1=30;
			int num2=0;
			int solution = num1/num2;
			
			System.out.println ("The answer is:"+solution);
		}
      
		catch(ArithmeticException e){
    	  
			System.out.println ("Invalid number, a number shouldn't be divided by zero.");
		}
      
	}
   
}