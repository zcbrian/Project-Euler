import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.Color;
public class GoldCard{
	static Color gold = new Color(255,255,98);
	public static void main(String[] args) {
		try{
			Robot r = new Robot();
			while(true){
				if(r.getPixelColor(613, 674).equals(gold)){
					r.keyPress(KeyEvent.VK_W);
					r.delay(1000);
					r.keyRelease(KeyEvent.VK_W);
				}
			}
		}catch (AWTException e){}
	}
}