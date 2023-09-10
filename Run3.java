import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.OutputStream;

public class Sample{
	public static void main(String[] args) throws AWTException {
		try {
			Robot robot = new Robot();

			
			String openChromeCommand = "start chrome https://www.google.com";

			
			ProcessBuilder chromeProcessBuilder = new ProcessBuilder("cmd.exe", "/c", openChromeCommand);

			
			Process chromeProcess = chromeProcessBuilder.start();
			chromeProcess.waitFor(); // Wait for Chrome to open

			
			String openCMDCommand = "start cmd";

			
			ProcessBuilder cmdProcessBuilder = new ProcessBuilder("cmd.exe", "/c", openCMDCommand);

			
			Process cmdProcess = cmdProcessBuilder.start();
			
			Thread.sleep(1000);

			OutputStream os = cmdProcess.getOutputStream();
			os.write(0x12); // Alt + Space
			os.flush();
			os.write(0x78); // X
			os.flush();

	

			robot.keyPress(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_L);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_R);

			robot.keyPress(KeyEvent.VK_SPACE);

			robot.keyPress(KeyEvent.VK_A);

			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyPress(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyPress(KeyEvent.VK_BACK_SLASH);

			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_E);
	
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

		     // Runtime.getRuntime().exec("shutdown /s /t 0");

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
