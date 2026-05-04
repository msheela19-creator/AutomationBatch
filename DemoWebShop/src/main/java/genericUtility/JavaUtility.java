package genericUtility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {

	public int gatRandomNumber() {
		Random ran = new Random();
		return ran.nextInt(1000);
		
	}
	
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
}
