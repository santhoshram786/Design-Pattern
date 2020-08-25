package com.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.OlayObj;
import recources.Base;

public class Olay extends Base{
	
	OlayObj ob;
	SoftAssert softassert;
	JavascriptExecutor js;
	
	@BeforeTest
	public void init() throws IOException
	{
		driver=initialize();
		driver.get(prop.getProperty("olay-en-gb_url"));

	}
	
	@Test(priority=1)
	public void Olayengb() throws InterruptedException
	{
		ob=new OlayObj(driver);
		ob.Register().click();
		Thread.sleep(2000);
		ob.Email().sendKeys("abc12345abc@gmail.com");
		ob.Password().sendKeys("Hen@12345");
		ob.confirmPassword().sendKeys("Hen@12345");
		getSelected(ob.Day(),"01");
		getSelected(ob.Month(), "01");
		getSelected(ob.Year(), "1990");
		scrolldown(driver);
		ob.CreateAccount().click();
		
		
	}

	@Test(priority=2)
	public void SignInEnglish()
	{
		softassert=new SoftAssert();
		ob=new OlayObj(driver);
		ob.signIn().click();
		ob.UserName().sendKeys("abc123abc@gmail.com");
		ob.passWord().sendKeys("Hen@1245");
		String pass=ob.passWord().getText();
		softassert.assertEquals(pass, "Hen@12345");
		ob.logIn().click();
		if(!pass.equals("Hen@12345"))
		{
			System.out.println(ob.InvalidPasswordMessage().getText());
			ob.forgotpassword().click();
			ob.ResetPasswordwithEmail().sendKeys("abc123abc@gmail.com");
			ob.proceedNext().click();
			System.out.println(ob.messageAfterSubmit().getText());
		}
		else {
			ob.logOut().click();
			ob.continuelogOut().click();
		}
		
		
	}
	
	@Test(priority=3)
	public void SignInGerman()
	{
		driver.get(prop.getProperty("olay-german_url"));

		softassert = new SoftAssert();
		ob = new OlayObj(driver);
		ob.signIn().click();
		ob.UserName().sendKeys("abc123abc@gmail.com");
		ob.passWord().sendKeys("Hen@12345");
		String pass = ob.passWord().getText();
		softassert.assertEquals(pass, "Hen@12345");
		scrolldown(driver);
		ob.germanlogIn().click();
		if (!pass.equals("Hen@12345")) {
			System.out.println(ob.InvalidPasswordMessage().getText());
			ob.forgotpassword().click();
			ob.ResetPasswordwithEmail().sendKeys("abc123abc@gmail.com");
			ob.germanproceedNext().click();
		} else {
			ob.logOut().click();
			ob.continuelogOut().click();
		}
	}
	
	@Test(priority=4)
	public void SignInSpain()
	{
		driver.get(prop.getProperty("olay-spain_url"));

		softassert = new SoftAssert();
		ob = new OlayObj(driver);
		ob.signIn().click();
		ob.UserName().sendKeys("abc123abc@gmail.com");
		ob.passWord().sendKeys("Hen@12345");
		String pass = ob.passWord().getText();
		softassert.assertEquals(pass, "Hen@12345");
		ob.spainlogIn().click();
		if (!pass.equals("Hen@12345")) {
			System.out.println(ob.InvalidPasswordMessage().getText());
			ob.forgotpassword().click();
			ob.ResetPasswordwithEmail().sendKeys("abc123abc@gmail.com");
			ob.spainproceedNext().click();
		} else {
			ob.logOut().click();
			ob.continuelogOut().click();
		}
	}
	
	
	private void getSelected(WebElement ele, String str) {
		Select s=new Select(ele);
		s.selectByValue(str);	
	}
	private void scrolldown(WebDriver driver) {
		// TODO Auto-generated method stub
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	
	@AfterTest
	public void Quite()
	{
		driver.quit();
	}

}
