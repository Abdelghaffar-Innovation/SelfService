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

WebUI.delay(150)

WebUI.waitForElementVisible(findTestObject('Requests/Tab_Requests'), 20)

WebUI.verifyElementVisible(findTestObject('Requests/Tab_Requests'))

WebUI.click(findTestObject('Requests/Tab_Requests'))

WebUI.waitForElementClickable(findTestObject('Requests/Btn_WorkSector'), 15)

WebUI.click(findTestObject('Requests/Btn_WorkSector'))

WebUI.waitForElementVisible(findTestObject('Requests/Option_RoaaRequest'), 10)

WebUI.click(findTestObject('Requests/Option_RoaaRequest'))

WebUI.waitForElementClickable(findTestObject('Requests/Btn_NewRequest'), 15)

WebUI.click(findTestObject('Requests/Btn_NewRequest'))

WebUI.waitForElementVisible(findTestObject('Requests/DropDown_Region'), 15)

WebUI.click(findTestObject('Requests/DropDown_Region'))

WebUI.click(findTestObject('Requests/Opti_Region'))

WebUI.waitForElementVisible(findTestObject('Requests/DropDown_City'), 15)

WebUI.click(findTestObject('Requests/DropDown_City'))

WebUI.click(findTestObject('Requests/Opti_City'))

WebUI.scrollToElement(findTestObject('Requests/TextArea_RequestDetailes'), 30)

WebUI.waitForElementVisible(findTestObject('Requests/TextArea_RequestDetailes'), 15)

WebUI.setText(findTestObject('Requests/TextArea_RequestDetailes'), 'Test')

WebUI.scrollToPosition(0, 2000)

WebUI.waitForElementVisible(findTestObject('Requests/Btn_SendRequest'), 30)

WebUI.click(findTestObject('Requests/Btn_SendRequest'))

WebUI.waitForElementVisible(findTestObject('Requests/Label_RequestProcess'), 20)

WebUI.waitForElementVisible(findTestObject('Requests/Label_RequestSuccess'), 15)

WebUI.verifyElementVisible(findTestObject('Requests/Label_RequestSuccess'))

WebUI.waitForElementClickable(findTestObject('Requests/Btn_BackHome'), 15)

WebUI.click(findTestObject('Requests/Btn_BackHome'))

WebUI.waitForElementVisible(findTestObject('Requests/Home_Page'), 30)

