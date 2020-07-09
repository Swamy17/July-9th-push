package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	@CacheLookup
	
	 WebElement user1;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	@CacheLookup
	
	 WebElement pass1;
  
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]")
	@CacheLookup
		WebElement login1;
	
	@FindBy(xpath="//a[contains(text(),'Life Insurance')]")
	@CacheLookup
		WebElement life;
	
	@FindBy(xpath="//span[contains(text(),'Term Insurance Return of Premium')]")
	@CacheLookup
		WebElement lifeClick;
	
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	
	
	public HomePage login(String un, String pwd)
	{
		//enterElement(user1,un);
		//enterElement(pass1,pwd);
			//loginBtn.click();
		    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		    	//js.executeScript("arguments[0].click();", loginBtn);
		    	//clickButton(login1,"Click on SignBtn");
		actionClick(driver,life);
		clickButton(lifeClick,"Click on SignBtn");		
		
		    	
		return new HomePage();
	}
	
	
	
	
}
