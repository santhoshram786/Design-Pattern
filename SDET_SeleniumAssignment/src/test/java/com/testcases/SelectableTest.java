package com.testcases;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.pageObjects;
import recources.Base;

public class SelectableTest extends Base{
	
	pageObjects sp;
	Select select;
	Actions action;
	@BeforeTest
	public void init() throws IOException
	{
		driver=initialize();
		driver.get(prop.getProperty("selectable_url"));

	}


	@Test(priority=1)
	public void getNameOfElements() throws IOException 
	{
		
		sp=new pageObjects(driver);
		String t=driver.getTitle();
		System.out.println("Title:"+t);
		System.out.println(sp.Elements().getText());
		System.out.println(sp.Forms().getText());
		System.out.println(sp.AlertFrameWindows().getText());
		System.out.println(sp.Widgets().getText());
		System.out.println(sp.Interactions().getText());
		System.out.println(sp.BookStroreApp().getText());
		System.out.println(sp.List().getText());
		System.out.println(sp.Grid().getText());
	
	}
	
	@Test(priority=2)
	
	public void Dropable()
	{
		driver.get(prop.getProperty("dragAndDrop_url"));
		action=new Actions(driver);
		action.dragAndDrop(sp.draggable(), sp.droppable()).build().perform();
		
		
	}
	
	@Test(priority=3)
	public void submitPracticalForm()
	{
		driver.get(prop.getProperty("automation-practice-form_url"));
		sp.firstName().sendKeys("Santhosh");
		sp.lastName().sendKeys("Kumar");
		sp.Email().sendKeys("Santhoshkumar@gmail.com");
		sp.Radio_Male().click();
		sp.Mobile_Number().sendKeys("123456789");
		sp.DateOfBirth().click();
		WebElement Year=sp.SelectYear();
		select=new Select(Year);
		select.selectByValue("2020");
		WebElement Month=sp.SelectMonth();
		select=new Select(Month);
		select.selectByValue("9");
		
		sp.SelectDay().click();
		System.out.println("Done");

		sp.Subject().sendKeys("Maths");
		
		sp.CheckReading().click();
		
		sp.currentAddress().sendKeys("Building 41-9");
		
		sp.State().sendKeys("Uttar Pradesh");
		
		sp.City().sendKeys("Agra");
		
		sp.Submit().click();
		
		
	}
	
	@AfterTest
	public void QuitBrowser()
	{
		driver.quit();
	}

}
