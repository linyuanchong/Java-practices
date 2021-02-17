/**
 * @author linyu
 *
 */
public class Celebrity {
	
	public String name = " ";
	public String whatTheyAreFamousFor = " ";
	public String instagramUserName = " ";
	
	//Constructor for all attributes.
	public Celebrity() {
		this.name = name;
		this.whatTheyAreFamousFor = whatTheyAreFamousFor;
		this.instagramUserName = instagramUserName;
	}
	
	//Constructor for one specified attribute.
	public Celebrity(String name) { 
		this.name = name;
	}
	
	//Constructor for two specified attributes.
	public Celebrity(String name, String whatTheyAreFamousFor) { 
		this.name = name;
		this.whatTheyAreFamousFor = whatTheyAreFamousFor;
	}
	
	//Constructor for three specified attributes
	public Celebrity(String name, String whatTheyAreFamousFor, String instagramUserName) { 
		this.name = name;
		this.whatTheyAreFamousFor = whatTheyAreFamousFor;
		this.instagramUserName = instagramUserName;
	}
}
