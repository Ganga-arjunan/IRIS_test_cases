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

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/img'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/div_Ganga A_grid-item'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input_Create Visual Workflow_mat-input-0'), 'Regression')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Regression_suite_Katalon'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Trinity - Iris/input_Databricks_database'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input_Databricks_database'), 'iris_test')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_iris_test'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Trinity - Iris/input_Databricks_mat-input-3'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_2810_test_tbl'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/div_2810_test_tbl'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Wrangle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Trinity - Iris/img_No transformations applied_rotate'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/img_Analyze_icons_align'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Case Statement'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/input__mat-input-5'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/div_col  Week'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input__mat-input-6'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input__mat-input-9'), '')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/input__mat-input-9'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Week'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Asc'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input__mat-input-8'), 'lag')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/img_iris_test.2810_test_tbl_saveclose-allow_9addf6'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/div_2810_test_tbl'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Wrangle'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Export To'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Databricks'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input_Cancel_mat-input-11'), 'iris_test')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_iris_test'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/input_Database Name_mat-input-12'), 'win_fun_lag')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Data Format'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Parquet'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Load Type'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Overwrite'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_File Compression Technique'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_None'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Export'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Trinity - Iris/div_Writing to Databricks Initiated'), 'Writing to Databricks Initiated')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/span_Save'))

WebUI.closeBrowser()

