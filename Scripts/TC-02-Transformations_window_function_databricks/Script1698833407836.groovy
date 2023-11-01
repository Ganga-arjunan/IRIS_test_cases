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

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Katalon_creation of workflow'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/img_Databricks_cluster-icons cluster_off ng_7641ca'),
	0)

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input_Databricks_database'))

WebUI.delay(30)

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input_Databricks_database'), 'iris')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_iris_test'))

WebUI.waitForElementVisible(findTestObject(null), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input_Databricks_mat-input-0'),
	0)

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input_Databricks_mat-input-0'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_48m_filter'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_48m_filter'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Wrangle'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/img_iris_test.48m_filter_closeBtnClass'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_x'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input_Databricks_mat-input-0'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_271021_custom_join_tbl'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_271021_custom_join_tbl'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Wrangle'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/img_Analyze_icons_align'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Case Statement'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-2'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_col  name'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-3'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-6'), '')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-6'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_name'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Asc'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-5'), 'lag')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/img_Analyze_icons_align'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Case Statement'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/mat-option_col  name'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-7'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-8'), '')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-8'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-7'), '')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_col  name'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-8'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-11'), '')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-11'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_dept'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Asc'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-10'), 'lead')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/img_Analyze_icons_align'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Case Statement'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/mat-option_name'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-13'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-13'), 'n')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_name'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/mat-option_Asc'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_New Column Name'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-12'), 'row_num')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_Function'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Case Statement'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_Order By Column'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_name'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Asc'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-14'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-14'), 'rank')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/img_Analyze_icons_align'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Case Statement'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-17'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_name'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Asc'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-16'), 'dense')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/img_Analyze_icons_align'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Case Statement'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-19'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_name'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Asc'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input__mat-input-18'), 'percent_rank')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Export To'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Databricks'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/mat-option_adhoc_covid19'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input_Cancel_mat-input-21'), 'ir')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_iris_test'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/input_Database Name_mat-input-22'),
	'win_func')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Data Format'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Parquet'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Load Type'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_Overwrite'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_File Compression Technique'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/span_None'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/button_Export'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/div_271021_custom_join_tbl'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Iris/Page_Trinity - Iris/button_Save'))

