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

// Generate random first and last names
String randomFirstName = "FirstName" + (new Random().nextInt(10000))
String randomLastName = "LastName" + (new Random().nextInt(10000))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://homzmart.com/en')

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/p_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Enter your phone number or email_outl_281146'), 'qota3er5b@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_/svg_Continue_MuiSvgIcon-root MuiSvgIcon-fon_408109'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Enter your password_outlined-basic'), '6KJkoHE/sDrMzjnwUVj344BcLI/3x6TS')

WebUI.click(findTestObject('Object Repository/Page_/svg_Login_MuiSvgIcon-root MuiSvgIcon-fontSi_579575'))

WebUI.click(findTestObject('Object Repository/Page_/div_Skip'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/div_Hi, qotbbbbbb.My Account'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/p_My Profile'))

// Set the random first and last names
WebUI.setText(findTestObject('Object Repository/Page_Homzmart/input_First Name_firstname'), randomFirstName)
WebUI.setText(findTestObject('Object Repository/Page_Homzmart/input_Last Name_lastname'), randomLastName)

WebUI.click(findTestObject('Object Repository/Page_Homzmart/span_Update Profile'))

// Log the random names for tracking purposes
println "Random First Name: " + randomFirstName
println "Random Last Name: " + randomLastName
