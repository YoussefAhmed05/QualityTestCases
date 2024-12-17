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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ecommerce-mern-b2j5.onrender.com/')

WebUI.click(findTestObject('Object Repository/Page_E-Commerce/a_Sign Up'))

WebUI.doubleClick(findTestObject('Object Repository/Page_E-Commerce/input_Full name_name'))

WebUI.setText(findTestObject('Object Repository/Page_E-Commerce/input_Full name_name'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_E-Commerce/input_Email address_email'), 'test11@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_E-Commerce/input_Password_password'), 'o+tS4OuGt32nW2fw4d97xA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_E-Commerce/input_Confirm Password_confirmPassword'), 'o+tS4OuGt32nW2fw4d97xA==')

WebUI.click(findTestObject('Object Repository/Page_E-Commerce/button_Sign up'))

WebUI.closeBrowser()

