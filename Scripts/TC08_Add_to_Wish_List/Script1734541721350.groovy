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

WebUI.navigateToUrl('https://homzmart.com/en')

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/p_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Enter your phone number or email_outl_281146'), 'qota3er5b@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_/button_Continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Enter your password_outlined-basic'), '6KJkoHE/sDrMzjnwUVj344BcLI/3x6TS')

WebUI.click(findTestObject('Object Repository/Page_/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_/div_Skip'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/h3_Luma Bella Turkish Coffee Maker 259 ml 5_e6bb1d'))

WebUI.click(findTestObject('Object Repository/Page_/img'))

