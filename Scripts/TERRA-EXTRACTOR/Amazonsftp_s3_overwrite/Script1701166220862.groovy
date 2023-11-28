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

System.setProperty('webdriver.chrome.driver', 'C:\\Users\\ga\\Katalon Studio\\My First Web UI Project (1)\\Drivers\\118\\chromedriver.exe')

ChromeOptions options = new ChromeOptions()

options.addArguments('user-data-dir=C:\\Users\\ga\\AppData\\Local\\Google\\Chrome\\User Data\\')

WebDriver driver = new ChromeDriver(options)

driver.get('https://extractors-test.trinityappmarketplace.com/')

DriverFactory.changeWebDriver(driver)

WebUI.maximizeWindow()
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://extractors-test.trinityappmarketplace.com/')
//
//WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'ga@trinitypartners.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), '1L0rAk3HNsWExaoda7f9Qw==')
//
//WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_Create a new Extractor'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Extractors/input__input_ul small ant-input ng-tns-c189_8fddf8'), 
    'amazonsftp_s3_overwrite')

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Extractors/textarea__input_ul small ant-input ng-tns-c_992033'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_Select source system'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_AWS'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/li_Amazon SFTP'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/input__ant-select-selection-search-input ng_567348'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_Amazon_SFTP_source'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/input__ant-select-selection-search-input ng_567348_1'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_dcube-dds-terra-extractors-source-test'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_Select file format'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_Structured Files'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/li_CSV'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/img'))

WebUI.rightClick(findTestObject('Object Repository/Page_Trinity - Extractors/div_Click to expand_global-loader-div ng-st_78d497'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/svg'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/span_Private_ant-radio'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/img'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/svg'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/span_decimal_test.csv'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/span_Choose'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/input__ant-select-selection-search-input ng_567348_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/nz-option-item_True'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_Select target system'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_AWS'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/li_Amazon S3'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/input__ant-select-selection-search-input ng_567348_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_S3_Target'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/input__ant-select-selection-search-input ng_567348_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/nz-option-item_dcube-dds-terra-extractors-t_24962e'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Extractors/input_Actions_ant-select-selection-search-i_c6065f'), 
    'S_No')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/input__ant-select-selection-search-input ng_567348_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_Complete'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/input__ant-select-selection-search-input ng_567348_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_Overwrite'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/input__ant-select-selection-search-input ng_567348_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_default'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Extractors/input_Current Table Name_ant-input ng-untou_706b20'), 
    'amazon_s3_over')

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Extractors/input_Actions_ant-select-selection-search-i_c6065f'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/input_Actions_ant-select-selection-search-i_c6065f'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_default'))

WebUI.rightClick(findTestObject('Object Repository/Page_Trinity - Extractors/input_Actions_ant-select-selection-search-i_c6065f'))

WebUI.setText(findTestObject('Object Repository/Page_Trinity - Extractors/input_Actions_ant-select-selection-search-i_c6065f'), 
    'amazon_s3_over_hist')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/div_Current Database Name default Current T_b4a382'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/span_Deploy Workflow'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Trinity - Extractors/p_Extractor has been created and deployed s_01c5e4'), 
    'Extractor has been created and deployed successfully')

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/nz-table-sorters_Created At'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/nz-table-sorters_Created At'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/a_amazonsftp_s3_overwrite'))

WebUI.click(findTestObject('Object Repository/Page_Trinity - Extractors/a_Custom'))

