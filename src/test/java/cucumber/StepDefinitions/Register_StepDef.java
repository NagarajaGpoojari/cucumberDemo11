package cucumber.StepDefinitions;

import java.util.ArrayList;
import cucumber.ExcelDataRead.ReadExcelFile;
import cucumber.PageObject.RegisterPage_PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.util.BaseClass;

public class Register_StepDef extends BaseClass {
	
	RegisterPage_PageObject registerPage;
	ReadExcelFile excelFile;
	
	@Given("^launch the  website using property file$")
	public void launch_the_website_using_property_file() throws Throwable {
		BaseClass.launchBrowser();
	}

	@When("^Go to My Account and Select Register$")
	public void go_to_My_Account_and_Select_Register() throws Throwable {
		registerPage=new RegisterPage_PageObject();
		registerPage.clickMyAccount();
	}

	@Then("^Enter the given details in the input field and click submit$")
	public void enter_the_given_details_in_the_input_field_and_click_submit() throws Throwable {
	   
		registerPage=new RegisterPage_PageObject();
		excelFile=new ReadExcelFile();
		ArrayList<String> testdata=excelFile.getData("user1");
		registerPage.registerOpenCart(testdata.get(1), testdata.get(2), testdata.get(3), testdata.get(4), testdata.get(5), testdata.get(6));
		System.out.println("Registered succsessfully");
	}

}
