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

WebUI.callTestCase(findTestCase('Login_IRIS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

//WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/img_NA_img_action'))
//
//WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Yes'))
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://iris-test.trinityappmarketplace.com/')
//
//WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'ga@trinitypartners.com')
//
//WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), '2t+OjwLCWIIL9KGSw7SKvg==')
//
//WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/div_Dont show this again'))
//
//WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/span_Dont show this again'))
//
//WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))
WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/img'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input_Create Visual Workflow_mat-input-0'), 'delete_workflow')

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/textarea__mat-input-1'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Databricks'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Next'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Trinity - Iris/img_Databricks_cluster-icons ng-star-insert_855733'), 
    0)

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/img_1'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input_Workflow_mat-input-2'), 'delete')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/img_NA_img_action'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/button_Yes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Trinity - Iris/div_Workflow Deleted Successfully'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://iris-test.trinityappmarketplace.com/')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'ga@trinitypartners.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), '2t+OjwLCWIIL9KGSw7SKvg==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/img'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/div_Name'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input_Create Visual Workflow_mat-input-0'), 'katalon_delete_workflow')

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/textarea__mat-input-1'), 'create and delete workflow')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Databricks'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Python'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/div_Restricted_mat-radio-outer-circle'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/img_1'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/div_Ganga A_grid-item'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input_Workflow_mat-input-2'), 'katalon_delete_workflow')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/img_NA_workflow_actions icon-hover'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/button_Yes'))

