import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Open browser and navigate to the website
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://homzmart.com/en')

// Perform login
WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/p_My Account'))
WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Enter your phone number or email_outl_281146'), 'test777@gmail.com')
WebUI.click(findTestObject('Object Repository/Page_/button_Continue'))

// Use the updated password from GlobalVariable
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Enter your password_outlined-basic'), GlobalVariable.currentPassword)

WebUI.click(findTestObject('Object Repository/Page_/button_Login'))
WebUI.click(findTestObject('Object Repository/Page_/div_Skip'))

println "Login successful with updated password."

WebUI.closeBrowser()
