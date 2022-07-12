package googleOBJ;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.sikuli.hotkey.Keys;

public class translateOBJ {

WebDriver driver = null;
	
	By Translate_Text_Input = By.className("er8xn");
	By Translate_Text_Output = By.className("J0lOec");
	By Translate_List = By.className("Llmcnf");
	By Translate_Dropdown_Language_List = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[5]/button/div[3]");
	By Translate_Search = By.className("yFQBKb");
	By Translate_Search_Back = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[2]/div/div[2]/div[1]/div/span/button/div[3]");
	By Translate_Search_X = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[2]/div/div[1]/div[4]/div/span/button/div[3]");
	By Translate_Voice = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[2]/div[8]/div/div[4]/div[1]/div[2]/div");
	
	public translateOBJ(WebDriver driver) {
		this.driver = driver;
	}

	public void translateInput(String text){
		driver.findElement(Translate_Text_Input).sendKeys(text);
	}
	
		
	public String translateOutput() {
		return driver.findElement(Translate_Text_Output).getText();
	}
	
	public void translateArrowDownClick() {
		driver.findElement(Translate_Dropdown_Language_List).click();
	}
	
	//public void translateSearchEsc() {
	//	driver.findElement(Translate_Search).sendKeys(Keys.ESC);
	//}
	
	public void translateSearchBack() {
		driver.findElement(Translate_Search_Back).click();
	}
	
	public void translateSearchX() {
		driver.findElement(Translate_Search_X).click();
	}
	
/*	public void translateHebrewClick() {
		driver.findElement(Translate_Hebrew).click();
	}
*/	
	public int translateListSize(){
		List<WebElement> trans_list = driver.findElements(Translate_List);
		return trans_list.size();
	}
	
	public WebElement translateList(){
		List<WebElement> langs = driver.findElements(Translate_List);
		return (WebElement) langs;
	}
	
	public void translateVoice() {
		driver.findElement(Translate_Voice).click();
	}
	
}
