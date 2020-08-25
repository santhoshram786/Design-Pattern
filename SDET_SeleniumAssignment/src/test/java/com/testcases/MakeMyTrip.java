package com.testcases;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.MakeTripObj;
import recources.Base;

public class MakeMyTrip extends Base{

	MakeTripObj mp;
	@BeforeTest
	public void init() throws IOException
	{
		driver=initialize();
		driver.get(prop.getProperty("makemytrip_url"));

	}

	@Test
	public void testt() throws ParseException
	{
		mp = new MakeTripObj(driver);
		driver.findElement(By.xpath("/html/body")).click();
		mp.fromCity().click();
		mp.fromInput().sendKeys("mum");
		List<WebElement> fromDrop = mp.fromDrop();

		for (WebElement down : fromDrop) {
			String city = down.getText();
			if (city.contains("Mumbai, India")) {
				down.click();
				break;
			}
		}
		mp.toInput().sendKeys("del");

		List<WebElement> toDrop = mp.toDrop();

		for (WebElement down : toDrop) {
			String city = down.getText();
			if (city.contains("Delhi, India")) {
				down.click();
				break;
			}
		}

		String beforexpath = "//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[";
		String afterxpath = "]/div[";
		boolean flag = false;
		for (int rownum = 1; rownum <= 6; rownum++) {
			for (int colnum = 1; colnum <= 7; colnum++) {

				WebElement day = driver.findElement(By.xpath(beforexpath + rownum + afterxpath + colnum + "]"));
				String text1 = day.getText();

				if (text1.contains("12")) {
					day.click();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}

		mp.Search().click();
		for (int second = 0; second <= 20; second++) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)", "");

		}
		List<WebElement> price = mp.price();
		List<Integer> list = new ArrayList<Integer>();
		for (WebElement value : price) {
			String money = value.getText();
			String arrmon[] = money.split(" ");

			for (int i = 1; i < arrmon.length; i++) {
				String text = arrmon[i];

				NumberFormat num = NumberFormat.getInstance();
				Number n = num.parse(text);
				String con = n.toString();

				int lowprice = Integer.parseInt(con);

				list.add(lowprice);

			}
		}
		System.out.println("The lowest price is:" + Collections.min(list));
	}

	@AfterTest
	public void QuitBrowser()
	{
		driver.quit();
	}

}
