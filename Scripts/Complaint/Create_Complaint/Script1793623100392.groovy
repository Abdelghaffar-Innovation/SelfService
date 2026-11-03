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

WebUI.callTestCase(findTestCase('Auth/Login'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('Object Repository/Complaint/Tab_ComplaintAndRequests'), 15)

WebUI.verifyElementVisible(findTestObject('Object Repository/Complaint/Tab_ComplaintAndRequests'))
WebUI.click(findTestObject('Object Repository/Complaint/Tab_ComplaintAndRequests'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Complaint/Page_-/a_'), 10)

WebUI.click(findTestObject('Object Repository/Complaint/Page_-/a_'))


WebUI.waitForElementClickable(findTestObject('Object Repository/Complaint/button_WorkSector'), 10)


WebUI.click(findTestObject('Object Repository/Complaint/button_WorkSector'))

WebUI.scrollToElement(findTestObject('Object Repository/Complaint/button_RoaaClassificaition'), 30)

WebUI.click(findTestObject('Object Repository/Complaint/button_RoaaClassificaition'))

WebUI.scrollToElement(findTestObject('Object Repository/Complaint/Label_RoaaSubcategory'), 15)

WebUI.verifyElementVisible(findTestObject('Object Repository/Complaint/Label_RoaaSubcategory'))
WebUI.delay(3)


CustomKeywords.'commin.common.clickAnyText'('طلب جديد')


WebUI.waitForElementVisible(findTestObject('Object Repository/Complaint/Label_CreateNewRequest'), 15)

WebUI.verifyElementVisible(findTestObject('Object Repository/Complaint/Label_CreateNewRequest'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Complaint/Dropdown_Reigon'), 20)

WebUI.click(findTestObject('Object Repository/Complaint/Dropdown_Reigon'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Complaint/Option_Reigon'), 20)

WebUI.click(findTestObject('Object Repository/Complaint/Option_Reigon'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Complaint/Dropdown_City'), 20)

WebUI.click(findTestObject('Object Repository/Complaint/Dropdown_City'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Complaint/Option_City'), 20)

WebUI.click(findTestObject('Object Repository/Complaint/Option_City'))

WebUI.scrollToElement(findTestObject('Object Repository/Complaint/Textarea_ReportDetalis'), 30)

WebUI.waitForElementVisible(findTestObject('Object Repository/Complaint/Textarea_ReportDetalis'), 0)

WebUI.setText(findTestObject('Object Repository/Complaint/Textarea_ReportDetalis'), 'Test')

WebUI.waitForElementClickable(findTestObject('Object Repository/Complaint/Btn_SubmitRequest'), 20)

CustomKeywords.'commin.common.clickAnyTextNorm'('ارسال الطلب')
//WebUI.click(findTestObject('Object Repository/Complaint/Btn_SubmitRequest'))

//WebUI.waitForElementVisible(findTestObject('Object Repository/Complaint/Label_RequestProcessing'), 20)

//WebUI.verifyElementVisible(findTestObject('Object Repository/Complaint/Label_RequestProcessing'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Complaint/Label_ComplaintSuccessr'), 30)

WebUI.waitForElementClickable(findTestObject('Object Repository/Complaint/Button_BackToHome'), 20)

CustomKeywords.'commin.common.clickAnyTextNorm'('الرجوع للرئيسية')
//WebUI.click(findTestObject('Object Repository/Complaint/Button_BackToHome'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Complaint/Home_Page'), 30)

