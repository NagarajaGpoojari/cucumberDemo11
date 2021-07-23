package cucumber.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.util.BaseClass;


	public class LoginPage_PageObject extends BaseClass{
		
		@FindBy(xpath="//span[text()='My Account']")
		WebElement myAccount;
		
		@FindBy(xpath="(//a[text()='Login'])[1]")
		WebElement loginBtn;
		
		@FindBy(id="input-email")
		WebElement email;
		
		@FindBy(id="input-password")
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement submit;
		
		@FindBy(xpath="//*[@id=\"account-account\"]/ul/li[1]/a/i")
		WebElement homeIcon;
		
		public LoginPage_PageObject() {
			PageFactory.initElements(driver, this);
		}
		
		public void clickloginBtn() {
			myAccount.click();
			loginBtn.click();
			
		}
		
		public void login(String mail, String pwd) {
			
			email.sendKeys(mail);
			password.sendKeys(pwd);
			submit.click();
			
			}
		
		public void goToHomePage() {
			homeIcon.click();
		}
		
		public String verifyHomePageTitle() {
			
			return driver.getTitle();
		}

	}



