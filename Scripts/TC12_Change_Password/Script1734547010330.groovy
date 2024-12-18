import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.util.CryptoUtil
import com.kms.katalon.core.model.FailureHandling as FailureHandling  // Add this import

// Generate a new random plain text password
String newPassword = "Pass" + (new Random().nextInt(100000)) + "@"

// Encrypt the password manually using Katalon's Encrypt Text Tool
// Replace 'K3jf73L1rOs=' with the encrypted value from the tool
String encryptedPassword = 'aP/zuRNtJbw='

// Open browser and navigate to the website
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://homzmart.com/en')

// Perform login
WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/p_My Account'))
WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/button_Sign in'))
WebUI.setText(findTestObject('Object Repository/Page_/input_Enter your phone number or email_outl_281146'), 'test777@gmail.com')
WebUI.click(findTestObject('Object Repository/Page_/button_Continue'))

// Use current password from GlobalVariable
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Enter your password_outlined-basic'), GlobalVariable.currentPassword)
WebUI.click(findTestObject('Object Repository/Page_/button_Login'))

// Handle potential overlay or pop-up
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/div_Skip'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Page_/div_Skip'))
}

// Navigate to "Change Password" screen
WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/div_Hi, FirstName.My Account'))
WebUI.scrollToElement(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/p_My Profile'), 5)
WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/p_My Profile'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Homzmart/p_Change'), 10)
WebUI.scrollToElement(findTestObject('Object Repository/Page_Homzmart/p_Change'), 5)
WebUI.click(findTestObject('Object Repository/Page_Homzmart/p_Change'))

// Change the password
WebUI.setText(findTestObject('Object Repository/Page_Homzmart/input_Old Password_oldPassword'), GlobalVariable.currentPassword)
WebUI.setText(findTestObject('Object Repository/Page_Homzmart/input_New Password_newPassword'), newPassword)
WebUI.setText(findTestObject('Object Repository/Page_Homzmart/input_Confirm Password_confirmPassword'), newPassword)
WebUI.click(findTestObject('Object Repository/Page_Homzmart/button_Save'))

// Update the GlobalVariable with the new encrypted password
GlobalVariable.currentPassword = encryptedPassword

// Print confirmation logs
println "Password successfully changed to: " + newPassword
println "Encrypted Password saved in GlobalVariable: " + GlobalVariable.currentPassword

// Close the browser
WebUI.closeBrowser()