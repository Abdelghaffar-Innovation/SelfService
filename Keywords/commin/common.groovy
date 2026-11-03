package commin
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class common {
	@Keyword
	def clickChoose() {
		TestObject btn = new TestObject('chooseBtn')
		btn.addProperty('xpath', ConditionType.EQUALS,
			"//button[@aria-label='اختر' and contains(@class,'dga-btn--primary-brand')]")
	
		WebUI.waitForElementPresent(btn, 30)
		WebUI.scrollToElement(btn, 5)
		try {
			WebUI.click(btn)
		} catch (Exception e) {
			WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(WebUI.findWebElement(btn, 5)))
		}
	}
	@Keyword
	def clickDeep(String selector) {
		String js = '''
        function findDeep(root, sel) {
            const found = root.querySelector(sel);
            if (found) return found;
            for (const el of root.querySelectorAll('*')) {
                if (el.shadowRoot) {
                    const r = findDeep(el.shadowRoot, sel);
                    if (r) return r;
                }
            }
            return null;
        }
        const el = findDeep(document, arguments[0]);
        if (!el) return false;
        el.scrollIntoView({block: 'center'});
        el.click();
        return true;
    '''
		boolean clicked = false
		for (int i = 0; i < 30 && !clicked; i++) {
			clicked = WebUI.executeJavaScript(js, [selector])
			if (!clicked) WebUI.delay(1)
		}
		assert clicked : "Element not found in any shadow root: " + selector
	}
	@Keyword
	def clickDeepByText(String text) {
		String js = '''
        function findDeep(root) {
            for (const b of root.querySelectorAll('button, [role="button"]')) {
                if (b.textContent.trim() === arguments[0]) return b;
            }
            for (const el of root.querySelectorAll('*')) {
                if (el.shadowRoot) {
                    const r = findDeep(el.shadowRoot);
                    if (r) return r;
                }
            }
            return null;
        }
        const el = findDeep(document);
        if (!el) return false;
        el.scrollIntoView({block: 'center'});
        el.click();
        return true;
    '''
		boolean clicked = false
		for (int i = 0; i < 30 && !clicked; i++) {
			clicked = WebUI.executeJavaScript(js, [text])
			if (!clicked) WebUI.delay(1)
		}
		assert clicked : "Button with text not found: " + text
	}
	@Keyword
	def clickAnyText(String text) {
		String js = '''
            const target = arguments[0];
            function find(root) {
                for (const el of root.querySelectorAll('*')) {
                    if (el.children.length === 0 &&
                        el.textContent.replace(/\\s+/g, ' ').trim() === target) return el;
                }
                for (const el of root.querySelectorAll('*')) {
                    if (el.shadowRoot) {
                        const r = find(el.shadowRoot);
                        if (r) return r;
                    }
                }
                return null;
            }
            const el = find(document);
            if (!el) return false;
            const c = el.closest('button, a, [role="button"], [role="tab"], [role="option"], li') || el;
            c.scrollIntoView({block: 'center'});
            ['mousedown', 'mouseup', 'click'].forEach(type =>
                c.dispatchEvent(new MouseEvent(type, {bubbles: true, cancelable: true, composed: true, view: window})));
            return true;
        '''
		boolean clicked = false
		for (int i = 0; i < 30 && !clicked; i++) {
			clicked = WebUI.executeJavaScript(js, [text])
			if (!clicked) WebUI.delay(1)
		}
		assert clicked : "Element with text not found: " + text
	}
	@Keyword
	def clickAnyTextNorm(String text) {
		String js = '''
        const norm = s => s.replace(/[أإآ]/g, 'ا').replace(/\\s+/g, ' ').trim();
        const target = norm(arguments[0]);
        function find(root) {
            for (const el of root.querySelectorAll('*')) {
                if (el.children.length === 0 && norm(el.textContent) === target) return el;
            }
            for (const el of root.querySelectorAll('*')) {
                if (el.shadowRoot) {
                    const r = find(el.shadowRoot);
                    if (r) return r;
                }
            }
            return null;
        }
        const el = find(document);
        if (!el) return false;
        const c = el.closest('button, a, [role="button"], [role="tab"], [role="option"], li') || el;
        if (c.disabled || c.getAttribute('aria-disabled') === 'true') return false;
        c.scrollIntoView({block: 'center'});
        ['mousedown', 'mouseup', 'click'].forEach(type =>
            c.dispatchEvent(new MouseEvent(type, {bubbles: true, cancelable: true, composed: true, view: window})));
        return true;
    '''
		boolean clicked = false
		for (int i = 0; i < 30 && !clicked; i++) {
			clicked = WebUI.executeJavaScript(js, [text])
			if (!clicked) WebUI.delay(1)
		}
		assert clicked : "Element with text not found or disabled: " + text
	}
	}
	
