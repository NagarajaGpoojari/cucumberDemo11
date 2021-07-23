package cucumber.StepDefinitions;

import java.util.ArrayList;
import cucumber.ExcelDataRead.ReadExcelFile;
import cucumber.PageObject.LoginPage_PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.util.BaseClass;

	public class LoginPage_StepDef extends BaseClass {
		
		LoginPage_PageObject login;
		ReadExcelFile excelFile;
		
		@Given("^launch the opencart website using property file$")
		public void launch_the_opencart_website_using_property_file() throws Throwable {
		    BaseClass.launchBrowser();
		}
		
		
		@When("^Go to My Account and Select login$")
		public void go_to_My_Account_and_Select_login() throws Throwable {
			login=new LoginPage_PageObject();
			login.clickloginBtn();
		       
		}

		@Then("^enter the valid credentails and submit$")
		public void enter_the_valid_credentails_and_submit() throws Throwable {
			login=new LoginPage_PageObject();
			excelFile=new ReadExcelFile();
			ArrayList<String> testdata=excelFile.getData("user1");
			login.login(testdata.get(3), testdata.get(5));
			System.out.println("Login Successfully");
			
		}
				
		}
		
		
