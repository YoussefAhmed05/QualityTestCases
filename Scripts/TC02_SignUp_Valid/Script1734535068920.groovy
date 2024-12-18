import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Generate a random email
String randomEmail = "user" + (new Random().nextInt(100000)) + "@example.com"

// Open browser and navigate to URL
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://homzmart.com/en')

// Interact with web elements to complete the sign-up process
WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/p_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Enter your phone number or email_outl_281146'), randomEmail)

WebUI.click(findTestObject('Object Repository/Page_/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_/input_First Name_outlined-basic'), 'testsign')

WebUI.setText(findTestObject('Object Repository/Page_/input_Phone Number_demo-controlled-open-sel_7bd89e'), '1018206007')

// Encrypt the password using Katalon Studio's encryption feature before running this script
WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Create password_outlined-basic'), 'dAMKXUGKBJQKXf4cBsJoJg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Confirm password_outlined-basic'), 'dAMKXUGKBJQKXf4cBsJoJg==')

WebUI.click(findTestObject('Object Repository/Page_/svg_Create Account_MuiSvgIcon-root MuiSvgIc_e5d189'))

WebUI.click(findTestObject('Object Repository/Page_/div_Skip'))

// Log the random email used for tracking purposes
println "Random email used for this run: " + randomEmail
