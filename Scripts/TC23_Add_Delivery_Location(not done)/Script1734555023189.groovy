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

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/div_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Enter your phone number or email_outl_281146'), 'firex@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_/button_Continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Enter your password_outlined-basic'), 'rq8aQz+wNFTp7J3AJfIUaKBNh023KKMIsfL+cGyq8os=')

WebUI.click(findTestObject('Object Repository/Page_/svg_Login_MuiSvgIcon-root MuiSvgIcon-fontSi_579575'))

WebUI.click(findTestObject('Object Repository/Page_/div_SkipVerify your mobile numberHelp us se_bd29bd'))

WebUI.click(findTestObject('Object Repository/Page_/div_Skip'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/img_Hi, fire_styles_ShoppingCartOutlinedIco_70447b'))

WebUI.click(findTestObject('Object Repository/Page_Buy Furniture and Home decor Online , _0aaba7/button_Go to cart'))

WebUI.click(findTestObject('Object Repository/Page_/img_Add Delivery Location_DeliverAddress_ar_0ac868'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Enter your phone number or email_outl_281146'), 'name')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Enter your password_outlined-basic'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_/input_Enter your password_outlined-basic'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Enter your password_outlined-basic'), 'Aq6/DzEzSDc=')

WebUI.setText(findTestObject('Object Repository/Page_/input_Building_building_number'), '1325')

WebUI.setText(findTestObject('Object Repository/Page_/input_Floor_floor'), '')

WebUI.click(findTestObject('Object Repository/Page_/label_Floor'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Floor_floor'), '3')

WebUI.setText(findTestObject('Object Repository/Page_/input_Apartment_apartment'), '4')

WebUI.setText(findTestObject('Object Repository/Page_/input_Address Details_street'), 'random 12')

WebUI.setText(findTestObject('Object Repository/Page_/input_Address Label_address_label'), 'random32')

WebUI.setText(findTestObject('Object Repository/Page_/input_Phone Number_demo-controlled-open-sel_7bd89e'), '')

WebUI.click(findTestObject('Object Repository/Page_/label_Phone Number'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Phone Number_demo-controlled-open-sel_7bd89e'), '1018206007')

WebUI.click(findTestObject('Object Repository/Page_/div_Save_MuiBackdrop-root MuiBackdrop-invis_fb27ad'))

WebUI.click(findTestObject('Object Repository/Page_/li_Beheira'))

WebUI.click(findTestObject('Object Repository/Page_/ul_please Select RegionKafr el DawarDamnhou_7cb7f5'))

WebUI.click(findTestObject('Object Repository/Page_/li_Kafr el Dawar'))

WebUI.click(findTestObject('Object Repository/Page_/button_Home'))

WebUI.click(findTestObject('Object Repository/Page_/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_/input_Address Details_street'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Address Details_street'), 'random ew12')

WebUI.click(findTestObject('Object Repository/Page_/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_/button_Confirm'))

