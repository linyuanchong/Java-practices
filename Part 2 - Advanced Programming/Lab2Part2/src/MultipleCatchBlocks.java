/**
 * @author linyu
 *
 */
public class MultipleCatchBlocks{
	
	/**
	 * @param args
	 */
	public static void main(String args[]){
		
		//Variables declaration for strings.
		String[] name = {"John", "Kent", "Jacob"};
		String age = null;
		
		try{
			//This one should be caught by index exception.
			System.out.println(name[3]);
			//or this one should be caught by null pointer exception.
			age.toString();
		}
		
		//Catches index exceptions.
		catch(ArrayIndexOutOfBoundsException e){
    	  
			System.out.println ("Index out of bounds.");
			e.printStackTrace();
		}
		
		//Catches null pointer exceptions.
		catch(NullPointerException e){
	    	  
			System.out.println ("Pointer is null.");
			e.printStackTrace();
			
		}
		
		catch(Exception e){
	    	  
			System.out.println ("There's a problem.");
			e.printStackTrace();
			
		}
      
	}
   
}