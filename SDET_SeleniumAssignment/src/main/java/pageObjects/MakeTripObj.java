package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeTripObj {

	public WebDriver d;
	
	
	public MakeTripObj(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);

	}

	@FindBy(id="fromCity")
	WebElement fromCity;
	
	public WebElement fromCity()
	{
		return fromCity;
	}
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	List<WebElement> fromDrop;
	
	public List<WebElement> fromDrop()
	{
		return fromDrop;
	}
	
	@FindBy(xpath="//div[@role='combobox']//child::input[@type='text']")
	WebElement fromInput;
	
	public WebElement fromInput()
	{
		return fromInput;
	}
	
	@FindBy(xpath="//div[@role='combobox']//child::input[@type='text']")
	WebElement toInput;
	
	public WebElement toInput()
	{
		return toInput;
	}
	
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	List<WebElement> toDrop;
	
	public List<WebElement> toDrop()
	{
		return toDrop;
	}
	
	@FindBy(xpath="//a[contains(text(), 'Search')]")
	WebElement Search;
	
	public WebElement Search()
	{
		return Search;
	}
	
	@FindBy(xpath="//div[@class='fli-intl-lhs pull-left']//div[@class='pull-left  make_relative price']//p")
	List<WebElement> price;
	
	public List<WebElement> price()
	{
		return price;
	}
	
	
	 
	
	


}
