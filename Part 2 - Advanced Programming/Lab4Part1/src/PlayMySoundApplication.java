import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author linyu
 *
 */
public class PlayMySoundApplication {
	
	//Audio variable so store sound.
	AudioClip splashSound;
	//URL variable.
	URL splashURL;
	//Name of file.
	String soundName = "splash.wav";
	
	public static void main(String[] args) {
		//Run.
		PlayMySoundApplication test = new PlayMySoundApplication();
		test.start();
	}
	
	/**
	 * 
	 */
	public void start() {

		try {
			//Construct file URL.
			splashURL = new URL("file:" + System.getProperty("user.dir") + "/" + soundName);
			
			System.out.println("Fetch " + splashURL.toString());
			
			//Uses applet class newAudioClip method to import a sound.
			splashSound = Applet.newAudioClip(PlayMySoundApplication.this.splashURL);
			
			//Play audio.
			splashSound.play();	   
		} 
		catch (MalformedURLException e) {
    	   	System.out.println(e.getMessage());
		}
		
	}

}


