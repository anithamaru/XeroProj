package StepDefinition;

import java.util.HashMap;




public class Utility_Getdata {
	public String getvalue(String arg1) {
		HashMap<String,String> objectRepo=new HashMap<String,String>();
		
		
		objectRepo.put("UserName","//input[@id='email']");
		objectRepo.put("Password","//input[@id='password']");
		objectRepo.put("Login Button","//button[@id='submitButton']");
		objectRepo.put("Validate Message","//p[contains(text(),'Your email or password is incorrect')]");
		objectRepo.put("Forgot Password","//a[@class='forgot-password-advert']");
		objectRepo.put("Send link","//span[@class='text']");
		objectRepo.put("Email","//input[@id='UserName']");
		objectRepo.put("Error Message","//h2[contains(text(),'Please check your email')]");
		objectRepo.put("Free Trial","//a[contains(text(),'Try Xero for free')]");
		objectRepo.put("FName","//input[@name='FirstName']");
		objectRepo.put("LName","//input[@name='LastName']");
		objectRepo.put("Email Add","//input[@name='EmailAddress']");
		objectRepo.put("Phone Num","//input[@name='PhoneNumber']");
		objectRepo.put("ImNotRobot","//body[@class='xero is-live-mode']");
		objectRepo.put("Terms","//input[@name='TermsAccepted']");
		objectRepo.put("Get Started","//button[@class='btn btn-primary']");
		objectRepo.put("FreeTrial","//a[@class='btn btn-primary global-ceiling-bar-btn']");
		objectRepo.put("Get Started unfilled","//span[@class='g-recaptcha-submit']");
		objectRepo.put("FName Error","//span[@id='signup-form-error-message-1']");
		objectRepo.put("LName Error","//span[@id='signup-form-error-message-2']");
		objectRepo.put("Email Error","//span[@id='signup-form-error-message-3']");
		objectRepo.put("Terms Error","//label[@class='form-label text']");
		objectRepo.put("Terms use","//a[contains(text(),'terms')]");
		objectRepo.put("Privacy Policy","//a[contains(text(),'privacy')]");
		objectRepo.put("Offer Details","//a[contains(text(),'offer details')]");
		objectRepo.put("Bookkeeper link","//a[contains(text(),'accountant or bookkeeper')]");
		objectRepo.put("Dash Board","Dashboard");
		objectRepo.put("Accounts","//button[contains(text(),'Accounting')]");
		objectRepo.put("Trial Account","//span[@class='xrh-banner--text']");
		objectRepo.put("Reports","//a[contains(text(),'Reports')]");
		objectRepo.put("Contacts","//button[contains(text(),'Contacts')]");
		objectRepo.put("Contacts Dropdown","//div[@class='xrh-dropdown--panel']");
		objectRepo.put("User Settings","//div[@class='xrh-appbutton--body']");
		objectRepo.put("Settings","//a[contains(text(),'Settings')]");
		objectRepo.put("Create New","/html/body/div[1]/header/div/ol[2]/li[1]/button/div");
		objectRepo.put("Create Dropdown","/html/body/div[1]/header/div/ol[2]/li[1]/div");
		objectRepo.put("Files","//a[contains(text(),'Files')]");
		objectRepo.put("Notification","//li[3]//button[1]//div[1]");
		objectRepo.put("Search","//li[2]//button[1]//div[1]");
		objectRepo.put("Search Field","//div[@class='input-container show-placeholder']");
		objectRepo.put("Help","//li[4]//button[1]//div[1]");
		objectRepo.put("Help Center","//div[@class='xn-h-task-list-search']");
		objectRepo.put("UserMenu","//li[5]//button[1]//div[1]");
		objectRepo.put("Logout","//li[5]/div/div[2]/div/ol/li[5]/a");
		objectRepo.put("navBox","//li[5]/div/div[2]/div/ol");
		objectRepo.put("Edit Profile","//li[@class='xrh-addon xrh-addon-lastvisible']//li[1]//a[1]");
		objectRepo.put("Upload Image","//span[@id='button-1041-btnInnerEl']");
		//objectRepo.put("Browse","//input[@id='filefield-1174-button-fileInputEl']");
		objectRepo.put("Browse","//input[@class='x-form-file-input']");
		objectRepo.put("Upload","//div[@class='x-btn blue x-exclude x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']");
		objectRepo.put("Remove Image","//span[@id='button-1044-btnInnerEl']");
		//==========================================================================
		//TC 8A
		objectRepo.put("Login","//li[@class='global-ceiling-bar-cta1']");
		objectRepo.put("User Dropdown","//*[@class='xrh-icon xrh-appbutton--caret xrh-icon-svg']");
		objectRepo.put("My Xero","//a[contains(text(),'My Xero')]");
		//objectRepo.put("Add Organization","//a[@id='ext-gen1043']");
		objectRepo.put("Add Organization","//html/body/div[4]/form/div/section[2]/div/a");
		objectRepo.put("nameOfOrg","//form/div[1]/div/div/input");
		objectRepo.put("Start Trial","//form/div[8]/div/button[1]");
		objectRepo.put("Pay Taxes","//form/div[2]/div/div/div/div[2]/div/div/button");
		objectRepo.put("United States","//li[@id='CNTRY/US']//span[@class='xui-pickitem--text']");
		objectRepo.put("Time Zone","//form/div[3]/div/div/div/div[2]/div/div/button/div");
		objectRepo.put("Pacific Zone","//span[contains(text(),'(UTC-08:00) Pacific Time (US & Canada)')]");
		objectRepo.put("Org Do","//form/div[4]/div/div/div/div[2]/div/input");
		objectRepo.put("Buy Now","//form/div[8]/div/button[2]");
		//======================================================================
		//TC8C
		objectRepo.put("Early","//section[@id='Early']//div[@class='xui-styledcheckboxradio--radio']");
		objectRepo.put("Continue Billing","//span[contains(text(),'Continue to select billing account')]");
		objectRepo.put("Street","//input[@id='contactAddress']");
		objectRepo.put("City","//input[@id='contactCity']"); 
		objectRepo.put("State","//div[@id='postalAddress']//button[@class='xui-button xui-select--button xui-button-standard']"); 
		objectRepo.put("California","//span[@class='xui-pickitem--text']contains(text(),'California')]");
		objectRepo.put("Zipcode","//input[@id='contactPostalCode']");
		objectRepo.put("Continue Review","//span[contains(text(),'Continue to review & pay')]");
		objectRepo.put("Credit","//span[contains(text(),'Credit card')]");
		objectRepo.put("Card Frame","//iframe[@name='__privateStripeFrame7']");
		objectRepo.put("Card Number","//input[@name='cardnumber']");
		objectRepo.put("Date Frame","//iframe[@name='__privateStripeFrame8']");
		objectRepo.put("Expiry Date","//input[@name='exp-date']");
		objectRepo.put("Security Frame","//iframe[@name='__privateStripeFrame9']");
		objectRepo.put("Security Code","//input[@name='cvc']");
		objectRepo.put("Name on Card","//input[@id='stripe-cardholder-name']");
		objectRepo.put("Conf Purchase","//span[contains(text(),'Confirm purchase')]");
		//=====================================================================
		objectRepo.put("Account","//li[@class='xrh-addon xrh-addon-lastvisible']//li[3]");  
		objectRepo.put("Subscriptions","//a[contains(text(),'Subscriptions & Billing')]");		 
			
		String value=objectRepo.get(arg1);
		return value;
	}
	
}
