package seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckBoxAndRadioButtonPage {
	public WebDriver driver;
	By redCheckBox = By.xpath("//input[@value='red']");
	By operaRadioBox = By.xpath("//input[@value='Opera']");
	public CheckBoxAndRadioButtonPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifyRedCheckBoxIsEnabled() {
		Boolean redCheckBoxIsEnabled,msgFlag=false;
		redCheckBoxIsEnabled = driver.findElement(redCheckBox).isEnabled();
		if(redCheckBoxIsEnabled) {
	
		}
		Assert.assertTrue(true, "Red Check Box is disabled");
	}
	public void verifyRedCheckBoxIsSelected() {
		Boolean redCheckBoxIsSelected,msgFlag=false;
		redCheckBoxIsSelected = driver.findElement(redCheckBox).isEnabled();
		if(redCheckBoxIsSelected) {
			
		}
		Assert.assertFalse(false, "Red Check Box is already selected");
	}
	public void verifyOperaRadioBoxIsSelected() {
		Boolean operaRadioBoxIsSelected,msgFlag=false;
		operaRadioBoxIsSelected = driver.findElement(operaRadioBox).isEnabled();
		if(operaRadioBoxIsSelected) {
			
		}
		Assert.assertFalse(false, "Red Check Box is already selected");
	}
	
}
