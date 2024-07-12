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

WebUI.navigateToUrl('https://www.btnproperti.co.id/')

WebUI.findWebElement(findTestObject('Step 1/Page_BTN Properti Kemudahan Miliki Rumah Im_e87203/a_Tools'))

WebUI.click(findTestObject('Object Repository/Step 1/Page_BTN Properti Kemudahan Miliki Rumah Im_e87203/a_Tools'))

WebUI.findWebElement(findTestObject('Step 1/Page_BTN Properti Kemudahan Miliki Rumah Im_e87203/a_Hitung Harga'))

WebUI.click(findTestObject('Object Repository/Step 1/Page_BTN Properti Kemudahan Miliki Rumah Im_e87203/a_Hitung Harga'))

WebUI.findWebElement(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/input_Hitung Harga Properti Maksimal_floati_bf0ef7'))

WebUI.setText(findTestObject('Object Repository/Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/input_Hitung Harga Properti Maksimal_floati_bf0ef7'), 
    '      10.000.000')

WebUI.findWebElement(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/input_Per Bulan_floating-label-field'))

WebUI.setText(findTestObject('Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/input_Per Bulan_floating-label-field'), 
    '      1.000.000')

WebUI.findWebElements(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/select_Jangka Waktu1 Tahun2 Tahun3 Tahun4 T_cf4447'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/select_Jangka Waktu1 Tahun2 Tahun3 Tahun4 T_cf4447'), 
    '1', true)

WebUI.findWebElement(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/button_Hitung'))

WebUI.click(findTestObject('Object Repository/Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/button_Hitung'))

WebUI.click(findTestObject('Object Repository/Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/h3_Rp 36.000.000'))

WebUI.rightClick(findTestObject('Object Repository/Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/div_Harga Properti Maksimal KamuRp 36.000.0_db86bc'))

WebUI.acceptAlert()

