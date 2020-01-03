Feature: Xero Website test cases
@SmokeTest
Scenario: Navigate to XERO TC_ID1A
Given : Launch the URL 
|Xero Webpage|
|https://login.xero.com/|
Then : Enter data into text box "UserName" "UserName"
|UserName|
|anitham2u@gmail.com|
Then : Enter data into text box "Password" "Password"
|Password|
|Anitha@123|
And : Click the Button "Login Button"
Then :Title is Displayed "Dashboard"
|pageName|
|Dashboard|


Scenario Outline:Incorrect Password TC_ID1B
Given : Launch the URL "<Xero Webpage>"
Then : Enter data into text box "UserName" "<sendUserName>"
Then : Enter data into text box "Password" "<sendPwd>"
And : Click the Button "Login Button"
Then : Validate message is displayed "Validate Message" "<DisplayMsg>"

Examples:
|sendUserName|        |sendPwd| |DisplayMsg|Xero Webpage|
|anitham2u@gmail.com| |Ani123|  |Your Email or Password is incorrect|https://login.xero.com/|

Scenario Outline:Incorrect Email TC_ID1C
Given : Launch the URL "<Xero Webpage>"
Then : Enter data into text box "UserName" "<sendUserName>"
Then : Enter data into text box "Password" "<sendPwd>"
And : Click the Button "Login Button"
Then : Validate message is displayed "Validate Message" "<DisplayMsg>"

Examples:
|sendUserName|        |sendPwd| |DisplayMsg|Xero Webpage|
|an7890@gmail.com| |Ani123|  |Your Email or Password is incorrect|https://login.xero.com/|


Scenario Outline:Navigate to XERO TC_ID1D
Given : Launch the URL "<Xero Webpage>"
And : Click the Button "Forgot Password"
Then : Enter data into text box "Email" "<email>"
And : Click the Button "Send link"
Then : Validate message is displayed "Error Message" "<DisplayMsg>"

Examples:
|email|        |DisplayMsg|Xero Webpage|
|anitham2u@gmail.com||Please check your email|https://login.xero.com/|


Scenario Outline:Sign Up to XDC TC_ID2A
Given : Launch the URL "<Xero Webpage>"
And : Click the Button "Free Trial"
Then : Enter data into text box "FName" "<FName>"
Then : Enter data into text box "LName" "<LName>"
Then : Enter data into text box "Email Add" "<Email Add>"
Then : Enter data into text box "Phone Num" "<Phone Num>"
Then : Click the check box "Terms"
And : Click the Button "Get Started"
When : Validate the url "<URL>"

Examples:
|FName||LName|   |Email Add|     | Phone Num||Xero Webpage|URL|
|Ani||Maru||anitham2u@gmail.com||5678009321||https://login.xero.com/|https://www.xero.com/us/signup/success/|


Scenario Outline:Sign Up to XDC TC_ID2B
Given : Launch the URL "<Xero Homepage>"
And : Click the Button "FreeTrial"
And : Click the Button "Get Started unfilled"
Then : Validate message is displayed "FName Error" "<FNameError>"
Then : Validate message is displayed "LName Error" "<LNameError>"
Then : Enter data into text box "Email Add" "<Wrong Email>"
Then : Validate message is displayed "Email Error" "<EmailError>"
Then : Validate Error message  "Terms Error" 

Examples:
|Xero Homepage|FNameError|LNameError|Wrong Email|EmailError|
|https://www.xero.com/us/|First name can't be empty|Last name can't be empty|amh|Email address is invalid|


Scenario Outline:Sign Up to XDC TC_ID2C
Given : Launch the URL "<Xero Homepage>"
And : Click the Button "FreeTrial"
And : Click the Button "Terms use"
Then : Check New Webpage "<Xero Terms Webpage>"
And : Click the Button "Privacy Policy"
Then : Check New Webpage "<Privacy Policy Webpage>"

Examples:
|Xero Homepage|Xero Terms Webpage|Privacy Policy Webpage|
|https://www.xero.com/us/|https://www.xero.com/us/about/legal/terms/|https://www.xero.com/us/about/privacy/|

Scenario Outline:Sign Up to XDC TC_ID2D
Given : Launch the URL "<Xero Homepage>"
And : Click the Button "FreeTrial"
And : Click the Button "Offer Details"
Then : Check New Webpage "<Offer Details Webpage>"

Examples:
|Xero Homepage|Offer Details Webpage|
|https://www.xero.com/us/|https://www.xero.com/us/signup/offer-details/|




Scenario Outline:Sign Up to XDC TC_ID2E
Given : Launch the URL "<Xero Homepage>"
And : Click the Button "FreeTrial"
And : Click the Button "Bookkeeper link"
Then :Title is Displayed "<Bookkeeper Msg>"

Examples:
|Xero Homepage|Bookkeeper Msg|
|https://www.xero.com/us/|A new Let's start a great partnership web page should open|


@SmokeTest
Scenario: Test all Tabs Page TC_ID3A
Given : Launch the URL 
|Xero Webpage|
|https://login.xero.com/|
Then : Enter data into text box "UserName" "UserName"
|UserName|
|anitham2u@gmail.com|
Then : Validate entered text "UserName" "UserName"
|UserName|
|anitham2u@gmail.com|

Then : Enter data into text box "Password" "Password"
|Password|
|Anitha@123|
And : Click the Button "Login Button"
Then :Title is Displayed "Dashboard"
|pageName|
|Dashboard|
And : Click the Button "Accounts"
And : Click the Button "Contacts"
Then : Is Displayed "Contacts Dropdown"
And : Click the Button "User Settings"
And : Click the Button "Settings"
Then :Title is Displayed "Settings"
|Settings|
|Organization settings|
And : Click the Button "Create New"
Then : Is Displayed "Create Dropdown"
And : Click the Button "User Settings"
And : Click the Button "Files"
Then :Title is Displayed "Files"
|Files|
|Files|
And : Click the Button "Notification"
And : Click the Button "Search"
#Then : Is Displayed "Search Field"
And : Click the Button "Help"
Then : Is Displayed "Help Center"



@SmokeTest
Scenario: Test Logout Functionality TC_ID04A
Given : Launch the URL 
|Xero Webpage|
|https://login.xero.com/|
Then : Enter data into text box "UserName" "UserName"
|UserName|
|anitham2u@gmail.com|
Then : Enter data into text box "Password" "Password"
|Password|
|Anitha@123|
And : Click the Button "Login Button"
Then :Title is Displayed "Dashboard"
|pageName|
|Dashboard|
And : Click the Button "UserMenu"
And : Click the Button "Logout"
Then :Title is Displayed "Home Page"
|pageName|
|Xero Accounting Software|


@SmokeTest
Scenario: Test Upload profile image TC_ID06A
Given : Launch the URL 
|Xero Webpage|
|https://login.xero.com/|
Then : Enter data into text box "UserName" "UserName"
|UserName|
|anitham2u@gmail.com|
Then : Enter data into text box "Password" "Password"
|Password|
|Anitha@123|
And : Click the Button "Login Button"
And : Click the Button "UserMenu"
Then : Is Displayed "navBox"
And : Click the Button "Edit Profile"
Then :Title is Displayed "Profile Settings"
|pageName|
|Profile Settings|
And : Click the Button "Upload Image"
Then : Enter data into text box "Browse" "Browse"
|Browse|
|C:\\Users\\mapkhome\\Pictures\\Capture.png|
And : Click the Button "Upload"
Then : Is Displayed "Remove Image"


Scenario: Add another organization Trail version TC_ID08A

Given : Launch the URL 
|Xero Webpage|
|https://login.xero.com/|
#And : Click the Button "Login"
Then : Enter data into text box "UserName" "UserName"
|UserName|
|anitham2u@gmail.com|
Then : Enter data into text box "Password" "Password"
|Password|
|Anitha@123|
And : Click the Button "Login Button"
Then :Title is Displayed "Dashboard"
|pageName|
|Dashboard|
And : Click the Button "User Dropdown"
And : Click the Button "My Xero"
And :Moving to New Window "Add Organization"
Then : Enter data into text box "nameOfOrg" "nameOfOrg"
|nameOfOrg|
|Selfabc|
And : Click the Button "Pay Taxes"
And : Click the Button "United States"
And : Click the Button "Time Zone"
And : Click the Button "Pacific Zone"

Then : Select data into text box "Org Do" "Org Do"
|Org Do|
|Accounting Practice|
And : Click the Button "Start Trial"
Then :Title is Displayed "Selfabc"
|pageName|
|Selfabc|


Scenario: Add another organization Trail version TC_ID08B

Given : Launch the URL 
|Xero Webpage|
|https://login.xero.com/|
#And : Click the Button "Login"
Then : Enter data into text box "UserName" "UserName"
|UserName|
|anitham2u@gmail.com|
Then : Enter data into text box "Password" "Password"
|Password|
|Anitha@123|
And : Click the Button "Login Button"
Then :Title is Displayed "Dashboard"
|pageName|
|Dashboard|
And : Click the Button "User Dropdown"
And : Click the Button "My Xero"
And :Moving to New Window "Add Organization"
Then : Enter data into text box "nameOfOrg" "nameOfOrg"
|nameOfOrg|
|Selfabc|
And : Click the Button "Pay Taxes"
And : Click the Button "United States"
And : Click the Button "Time Zone"
And : Click the Button "Pacific Zone"

Then : Select data into text box "Org Do" "Org Do"
|Org Do|
|Accounting Practice|
And : Click the Button "Buy Now"
Then :Title is Displayed "Billing Subscriptions"
|pageName|
| Billing Subscriptions|


Scenario: Add another organization - Starter Plan TC_ID08C
Given : Launch the URL 
|Xero Webpage|
|https://login.xero.com/|
#And : Click the Button "Login"
Then : Enter data into text box "UserName" "UserName"
|UserName|
|anitham2u@gmail.com|
Then : Enter data into text box "Password" "Password"
|Password|
|Anitha@123|
And : Click the Button "Login Button"
Then :Title is Displayed "Dashboard"
|pageName|
|Dashboard|
And : Click the Button "User Dropdown"
And : Click the Button "My Xero"
And :Moving to New Window "Add Organization"
Then : Enter data into text box "nameOfOrg" "nameOfOrg"
|nameOfOrg|
|Selfabc|
And : Click the Button "Pay Taxes"
And : Click the Button "United States"
And : Click the Button "Time Zone"
And : Click the Button "Pacific Zone"

Then : Select data into text box "Org Do" "Org Do"
|Org Do|
|Accounting Practice|
And : Click the Button "Buy Now"
Then :Title is Displayed "Billing Subscriptions"
|pageName|
| Billing Subscriptions|
And : Click the Button "Early"
And : Click the Button "Continue Billing"
Then : Enter data into text box "Street" "Street"
|Street|
|3450 granada ave|
Then : Enter data into text box "City" "City"
|City|
|santa clara|
Then : Enter data into text box "State" "State"
|State|
|California|
Then : Enter data into text box "Zipcode" "Zipcode"
|Zipcode|
|95051|
And : Click the Button "Continue Review"
And : Click the Button "Credit"
Then :Switch to frame "Card Frame" 
Then : Enter data into text box "Card Number" "Card Number"
|Card Number|
|4545704274328997|
Then :Switch out frame
Then :Switch to frame "Date Frame"
Then : Enter data into text box "Expiry Date" "Expiry Date"
|Expiry Date|
|10/22|
Then :Switch out frame
Then :Switch to frame "Security Frame"
Then : Enter data into text box "Security Code" "Security Code"
|Security Code|
|386|
Then :Switch out frame 
Then : Enter data into text box "Name on Card" "Name on Card"
|Name on Card|
|Anita M|
And : Click the Button "Conf Purchase"


Scenario: Check if users can lookout for their subscription and billing TC_ID10

Given : Launch the URL 
|Xero Webpage|
|https://login.xero.com/|
#And : Click the Button "Login"
Then : Enter data into text box "UserName" "UserName"
|UserName|
|anitham2u@gmail.com|
Then : Enter data into text box "Password" "Password"
|Password|
|Anitha@123|
And : Click the Button "Login Button"
Then :Title is Displayed "Dashboard"
|pageName|
|Dashboard|
And : Click the Button "UserMenu"
And : Click the Button "Account"
And : Click the Button "Subscriptions"