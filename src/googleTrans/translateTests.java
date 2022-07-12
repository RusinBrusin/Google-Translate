package googleTrans;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import googleOBJ.translateOBJ;



public class translateTests {

private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		hMNI();
	}

	public static void hMNI() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rusin\\Desktop\\study\\Eclipse proj\\Drivers\\chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://translate.google.com");
		
		translateOBJ trnsObj = new translateOBJ(driver);
		
		// input
		trnsObj.translateInput("Enter your text here");
		
		
			
		int trnsListSize = trnsObj.translateListSize();
		By Translate_List = By.className("qSb8Pe");
		
		Thread.sleep(2000);
		System.out.println(trnsObj.translateOutput());
		
		trnsObj.translateArrowDownClick();
		
		System.out.println("there are ' " + trnsListSize + " ' languages to translate with");
		
		Thread.sleep(2000);
		trnsObj.translateSearchBack();
		trnsObj.translateSearchX();
		
		
		
		List<WebElement> langs = driver.findElements(Translate_List);
		
		for (int i = 0; i <= trnsListSize; i++) {
			try {
			
				trnsObj.translateArrowDownClick();
				WebElement language_Chosen = langs.get(i);
				String  language_Name = language_Chosen.getText();
				Thread.sleep(100);
				language_Chosen.click();
				Thread.sleep(2000);
			
					if (!(language_Chosen == null)) {
						System.out.println("In the language of " + language_Name + ":");
						Thread.sleep(100);
						System.out.println(trnsObj.translateOutput());
						try {
							trnsObj.translateVoice();
							Thread.sleep(5000);
							System.out.println("This language has Text To Speech");
							System.out.println("");
						}
						catch (Exception e) {
							System.out.println("This language DOES NOT have Text To Speech");
							System.out.println("");
						}			
				}
			}
			catch (Exception e) {
				
			}
			
		}
		
		System.out.println("Test is done and successful");
	}
}
