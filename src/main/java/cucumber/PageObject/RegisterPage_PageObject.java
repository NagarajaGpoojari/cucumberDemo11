package cucumber.PageObject;



	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import cucumber.util.BaseClass;

	

	public class RegisterPage_PageObject extends BaseClass{
		
		@FindBy(xpath="//span[text()='My Account']")
		WebElement myAccount;
		
		@FindBy(xpath="//a[text()='Register']")
		WebElement register;
		
		@FindBy(id="input-firstname")
		WebElement firstName;
		
		@FindBy(id="input-lastname")
		WebElement lastName;
		
		@FindBy(id="input-email")
		WebElement email;
		
		@FindBy(id="input-telephone")
		WebElement telephone;
		
		@FindBy(id="input-password")
		WebElement password;
		
		@FindBy(id="input-confirm")
		WebElement confirmPassword;
		
		 @FindBy(name="newsletter") 
		 WebElement nletter;
		
		@FindBy(xpath="//input[@type='checkbox']")
		WebElement checkbox;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement submit;
		
		
		public RegisterPage_PageObject() {
			PageFactory.initElements(driver, this);
		}
		
		public void clickMyAccount() {
			myAccount.click();
			register.click();
		}
		
		public void registerOpenCart(String fName, String lName, String mail, String phoneNumber,
				String pword,String cpword) {
			firstName.sendKeys(fName);
			lastName.sendKeys(lName);
			email.sendKeys(mail);
			telephone.sendKeys(phoneNumber);
			password.sendKeys(pword);
			confirmPassword.sendKeys(cpword);
			nletter.click();
			checkbox.click();
			submit.click();
			
		}
		
		public void registerInvalidOpenCart(String fName, String lName, String mail, 
				String pword,String cpword) {
			
			firstName.sendKeys(fName);
			lastName.sendKeys(lName);
			email.sendKeys(mail);
			
			password.sendKeys(pword);
			confirmPassword.sendKeys(cpword);
			nletter.click();
			checkbox.click();
			submit.click();
			
			TakesScreenshot ts=(TakesScreenshot)driver;        
		    File source=ts.getScreenshotAs(OutputType.FILE);
		    try {
				FileUtils.copyFile(source, new File("./screenshots/RegisterFailed.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("RegisterFailed  screenshot is taken");
			
		}
		
		
		

	


}
