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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Login_IRIS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://iris-test.trinityappmarketplace.com/')
//
//WebUI.closeBrowser()
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://iris-test.trinityappmarketplace.com/')
//
//WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Sign in to your account/input_Sign in_loginfmt'), 
//    'ga@trinitypartners.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Sign in to your account/input_Enter password_passwd'), 
//    '2t+OjwLCWIIL9KGSw7SKvg==')
//
//WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Sign in to your account/input_concat(Don, , t show this again)_idSIButton9'))
//
WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/img'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input_Create Visual Workflow_mat-input-0'), 
    'creation_with_deletion_of_workflow')

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/textarea__mat-input-1'), 'katalon_test_case')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_Databricks'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Scala'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_Workflow Permissions_mat-radio-inner-circle'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Next'))

WebUI.click(findTestObject('Page_Trinity - Iris/Page_Trinity - Iris/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/img_1'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input_Workflow_mat-input-2'), 'creation')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/img_NA_workflow_actions icon-hover'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/button_Yes'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_Workflow Deleted Successfully'), 
    'Workflow Deleted Successfully')

WebUI.closeBrowser()

