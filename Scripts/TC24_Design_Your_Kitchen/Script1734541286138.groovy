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

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/img_End-of-Year Clearance Get extra 15 disc_aeb651'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/img_Shop By Category_undefined'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/p_Full Kitchen'))

WebUI.click(findTestObject('Object Repository/Page_/img'))

WebUI.click(findTestObject('Object Repository/Page_HomzDesign - Quiz/div_Choose your kitchen color_sc-iwyWfK bOv_1b592f'))

WebUI.click(findTestObject('Object Repository/Page_HomzDesign - Quiz/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_HomzDesign - Quiz/div_L-Shape'))

WebUI.setText(findTestObject('Object Repository/Page_HomzDesign - Quiz/input_Ex Maadi Living Room_r0'), 'TEst')

WebUI.click(findTestObject('Object Repository/Page_HomzDesign - Quiz/p_Go to my room'))

WebUI.setText(findTestObject('Object Repository/Page_HomzDesign - Quiz/input_Enter your phone number or email_outlined-basic'), 
    'qotb@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_HomzDesign - Quiz/button_Continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HomzDesign - Quiz/input_Enter your password_outlined-basic'), 
    'YYmZ1o1jXazmzPuWffRxnw==')

WebUI.click(findTestObject('Object Repository/Page_HomzDesign - Quiz/svg_Login_MuiSvgIcon-root MuiSvgIcon-fontSi_579575'))

