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

WebUI.navigateToUrl('http://10.240.142.140/complaints')

WebUI.maximizeWindow()

WebUI.delay(180)

WebUI.waitForElementVisible(findTestObject('Complaint/Tab_ComplaintAndRequests'), 15)

WebUI.verifyElementVisible(findTestObject('Complaint/Tab_ComplaintAndRequests'))

WebUI.waitForElementClickable(findTestObject('Complaint/button_WorkSector'), 10)

WebUI.click(findTestObject('Complaint/button_WorkSector'))

WebUI.scrollToElement(findTestObject('Complaint/button_RoaaClassificaition'), 30)

WebUI.click(findTestObject('Complaint/button_RoaaClassificaition'))

WebUI.scrollToElement(findTestObject('Complaint/Label_RoaaSubcategory'), 30)

WebUI.verifyElementVisible(findTestObject('Complaint/Label_RoaaSubcategory'))

WebUI.click(findTestObject('Complaint/Label_RoaaSubcategory'))

WebUI.waitForElementVisible(findTestObject('Complaint/Label_CreateNewRequest'), 30)

WebUI.verifyElementVisible(findTestObject('Complaint/Label_CreateNewRequest'))

WebUI.waitForElementVisible(findTestObject('Complaint/Dropdown_Reigon'), 20)

WebUI.click(findTestObject('Complaint/Dropdown_Reigon'))

WebUI.waitForElementClickable(findTestObject('Complaint/Option_Reigon'), 20)

WebUI.click(findTestObject('Complaint/Option_Reigon'))

WebUI.waitForElementVisible(findTestObject('Complaint/Dropdown_City'), 20)

WebUI.click(findTestObject('Complaint/Dropdown_City'))

WebUI.waitForElementClickable(findTestObject('Complaint/Option_City'), 20)

WebUI.click(findTestObject('Complaint/Option_City'))

WebUI.scrollToElement(findTestObject('Complaint/Textarea_ReportDetalis'), 30)

WebUI.waitForElementVisible(findTestObject('Complaint/Textarea_ReportDetalis'), 0)

WebUI.setText(findTestObject('Complaint/Textarea_ReportDetalis'), 'Test')

WebUI.waitForElementClickable(findTestObject('Complaint/Btn_SubmitRequest'), 20)

WebUI.click(findTestObject('Complaint/Btn_SubmitRequest'))

WebUI.waitForElementVisible(findTestObject('Complaint/Label_RequestProcessing'), 20)

WebUI.verifyElementVisible(findTestObject('Complaint/Label_RequestProcessing'))

WebUI.waitForElementVisible(findTestObject('Complaint/Label_ComplaintSuccessr'), 30)

WebUI.waitForElementClickable(findTestObject('Complaint/Button_BackToHome'), 20)

WebUI.click(findTestObject('Complaint/Button_BackToHome'))

WebUI.waitForElementVisible(findTestObject('Complaint/Home_Page'), 30)

