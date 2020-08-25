package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObjects {
	
public WebDriver driver;

	public pageObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]")
	WebElement Elements;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[1]")
	WebElement Forms;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]")
	WebElement AlertFrameWindows;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span/div/div[1]")
	WebElement Widgets;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div/div[1]")
	WebElement Interactions;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/span/div/div[1]")
	WebElement BookStroreApp;
	
	
	
	
	@FindBy(id="draggable")
	WebElement draggable;
	public WebElement draggable()
	{
		return draggable;
	}
	
	
	@FindBy(id="droppable")
	WebElement droppable;
	
	public WebElement droppable()
	{
		return droppable;
	}
	
	
	@FindBy(id="demo-tab-list")
	WebElement List;
	
	@FindBy(id="demo-tab-grid")
	WebElement Grid;
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	public WebElement firstName()
	{
		return firstName;
	}
	@FindBy(id="lastName")
	WebElement lastName;

	public WebElement lastName()
	{
		return lastName;
	}
	@FindBy(id="gender-radio-1")
	WebElement Radio_Male;
	public WebElement Radio_Male()
	{
		return Radio_Male;
	}

	@FindBy(id="userEmail")
	WebElement Email;
	public WebElement Email()
	{
		return Email;
	}
	
	@FindBy(id="userNumber")
	WebElement Mobile_Number;
	
	public WebElement Mobile_Number()
	{
		return Mobile_Number;
	}
	
	@FindBy(id="dateOfBirthInput")
	WebElement DateOfBirth;
	
	public WebElement DateOfBirth()
	{
		return DateOfBirth;
	}
	
	
	@FindBy(css=".react-datepicker__year-select")
	WebElement SelectYear;
	public WebElement SelectYear()
	{
		return SelectYear;
	}
	
	
	@FindBy(css=".react-datepicker__month-select")
	WebElement SelectMonth;
	public WebElement SelectMonth()
	{
		return SelectMonth;
	}
	
	
	@FindBy(css=".react-datepicker__day.react-datepicker__day--012")
	WebElement SelectDay;
	public WebElement SelectDay()
	{
		return SelectDay;
	}
	@FindBy(id="subjectsContainer")
	WebElement Subject;

	public WebElement Subject()
	{
		return Subject;
	}
	@FindBy(id="hobbies-checkbox-2")
	WebElement CheckReading;
	
	public WebElement CheckReading()
	{
		return CheckReading;
	}
	@FindBy(id="hobbies-checkbox-1")
	WebElement CheckSports;

	public WebElement CheckSports()
	{
		return CheckSports;
	}
	
	@FindBy(id="hobbies-checkbox-3")
	WebElement CheckMusic;
	
	public WebElement CheckMusic()
	{
		return CheckMusic;
	}

	@FindBy(id="currentAddress")
	WebElement currentAddress;
	public WebElement currentAddress()
	{
		return currentAddress;
	}
	
	@FindBy(id="state")
	WebElement State;
	
	public WebElement State()
	{
		return State;
	}
	@FindBy(id="city")
	WebElement City;
	
	public WebElement City()
	{
		return City;
	}
	
	@FindBy(id="submit")
	WebElement Submit;
	
	public WebElement Submit()
	{
		return Submit;
	}
	

	public WebElement Elements()
	{
		return Elements;
	}
	
	public WebElement Forms()
	{
		return Forms;
	}
	
	public WebElement AlertFrameWindows()
	{
		return AlertFrameWindows;
	}
	public WebElement Widgets()
	{
		return Widgets;
	}
	public WebElement Interactions()
	{
		return Interactions;
	}
	public WebElement BookStroreApp()
	{
		return BookStroreApp;
	}

	public WebElement List()
	{
		return List;
	}
	
	public WebElement Grid()
	{
		return Grid;
	}
}
