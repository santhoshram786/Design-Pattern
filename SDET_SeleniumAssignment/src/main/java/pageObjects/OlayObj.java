package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OlayObj {

	WebDriver d;
	public OlayObj(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);

	}
	
	@FindBy(css=".event_profile_register")
	WebElement Register;
	
	public WebElement Register()
	{
		return Register;
	}
	
	@FindBy(id="phdesktopbody_0_grs_account[emails][0][address]")
	WebElement Email;
	
	public WebElement Email()
	{
		return Email;
	}
	
	@FindBy(id="phdesktopbody_0_grs_account[password][password]")
	WebElement Password;
	
	public WebElement Password()
	{
		return Password;
	}
	
	@FindBy(id="phdesktopbody_0_grs_account[password][confirm]")
	WebElement confirmPassword;
	
	public WebElement confirmPassword()
	{
		return confirmPassword;
	}
	
	@FindBy(id="phdesktopbody_0_grs_consumer[birthdate][day]")
	WebElement Day;
	
	public WebElement Day()
	{
		return Day;
	}
	
	@FindBy(id="phdesktopbody_0_grs_consumer[birthdate][month]")
	WebElement Month;
	
	public WebElement Month()
	{
		return Month;
	}
	
	@FindBy(id="phdesktopbody_0_grs_consumer[birthdate][year]")
	WebElement Year;
	
	public WebElement Year()
	{
		return Year;
	}
	
	@FindBy(id="phdesktopbody_0_submit")
	WebElement CreateAccount;
	
	public WebElement CreateAccount()
	{
		return CreateAccount;
	}
	
	@FindBy(css=".event_profile_login")
	WebElement signIn;
	
	public WebElement signIn()
	{
		return signIn;
	}
	
	@FindBy(id="phdesktopbody_0_username")
	WebElement UserName;
	
	public WebElement UserName()
	{
		return UserName;
	}
	
	@FindBy(id="phdesktopbody_0_password")
	WebElement passWord;
	
	public WebElement passWord()
	{
		return passWord;
	}
	
	@FindBy(id="phdesktopbody_0_SIGN IN")
	WebElement logIn;
	
	public WebElement logIn()
	{
		return logIn;
	}
	@FindBy(id="phdesktopbody_0_ANMELDEN")
	WebElement germanlogIn;
	
	public WebElement germanlogIn()
	{
		return germanlogIn;
	}
	@FindBy(id="phdesktopbody_0_INICIAR SESIÓN")
	WebElement spainlogIn;
	
	public WebElement spainlogIn()
	{
		return spainlogIn;
	}
	
	@FindBy(id="phdesktopheader_0_phdesktopheadertop_2_LogOffLink")
	WebElement logOut;
	
	public WebElement logOut()
	{
		return logOut;
	}
	
	@FindBy(id="phdesktopheader_0_phdesktopheadertop_2_anchrContinue")
	WebElement continuelogOut;
	
	public WebElement continuelogOut()
	{
		return continuelogOut;
	}
	@FindBy(id="phdesktopbody_0_Message")
	WebElement InvalidPasswordMessage;
	
	public WebElement InvalidPasswordMessage()
	{
		return InvalidPasswordMessage;
	}
	
	@FindBy(id="phdesktopbody_0_forgotpassword")
	WebElement forgotpassword;
	
	public WebElement forgotpassword()
	{
		return forgotpassword;
	}
	@FindBy(id="phdesktopbody_0_username")
	WebElement ResetPasswordwithEmail;
	
	public WebElement ResetPasswordwithEmail()
	{
		return ResetPasswordwithEmail;
	}
	
	@FindBy(id="phdesktopbody_0_NEXT")
	WebElement proceedNext;
	
	public WebElement proceedNext()
	{
		return proceedNext;
	}

	@FindBy(id="phdesktopbody_0_WEITER")
	WebElement germanproceedNext;
	
	public WebElement germanproceedNext()
	{
		return germanproceedNext;
	}


	@FindBy(id="phdesktopbody_0_SIGUIENTE")
	WebElement spainproceedNext;
	
	public WebElement spainproceedNext()
	{
		return spainproceedNext;
	}

	
	@FindBy(id="phdesktopbody_0_afterSubmit")
	WebElement messageAfterSubmit;
	
	public WebElement messageAfterSubmit()
	{
		return messageAfterSubmit;
	}
	
	
	
	
}
