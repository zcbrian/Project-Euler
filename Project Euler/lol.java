import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.Color;

public class lol{

	static Color c = new Color(255,255,98);
	
	public static void main(String[] args) {
		try{
			
			int i = 0;System.out.println("starting");
			
			Robot r = new Robot();
			
			while(true){
				if(r.getPixelColor(613, 674).equals(c)){
					System.out.println("w" + i);
					i++;
					r.keyPress(KeyEvent.VK_W);
					r.delay(1000);
					r.keyRelease(KeyEvent.VK_W);
				}
			}
		
		}catch (AWTException e){}
	}
}