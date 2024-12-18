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

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/input__grouped-demo'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/p_Tables'))

WebUI.click(findTestObject('Object Repository/Page_Find the Perfect Table for Your Home -_28535e/input_Price low to high_radio-buttons-group'))

WebUI.click(findTestObject('Object Repository/Page_Find the Perfect Table for Your Home -_28535e/input__PrivateSwitchBase-input muiltr-1m9pwf3'))

WebUI.click(findTestObject('Object Repository/Page_Find the Perfect Table for Your Home -_28535e/input_(897)_PrivateSwitchBase-input muiltr-1m9pwf3'))

WebUI.click(findTestObject('Object Repository/Page_Find the Perfect Table for Your Home -_28535e/div_Apply'))
