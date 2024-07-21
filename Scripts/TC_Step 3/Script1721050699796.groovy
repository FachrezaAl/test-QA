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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.btnproperti.co.id/tools/hitung-harga-properti')

WebUI.findWebElement(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/input_Hitung Harga Properti Maksimal_floati_bf0ef7'))

WebUI.setText(findTestObject('Object Repository/Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/input_Hitung Harga Properti Maksimal_floati_bf0ef7'), 
    Pemasukan)

WebUI.findWebElement(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/input_Per Bulan_floating-label-field'))

WebUI.setText(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/input_Per Bulan_floating-label-field'), 
    Pengeluaran)

if (Pemasukan > Pengeluaran) {
    WebUI.findWebElements(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/select_Jangka Waktu1 Tahun2 Tahun3 Tahun4 T_cf4447'), 
        0)

    WebUI.selectOptionByValue(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/select_Jangka Waktu1 Tahun2 Tahun3 Tahun4 T_cf4447'), 
        Jangka_Waktu, false)

    WebUI.findWebElement(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/button_Hitung'))

    WebUI.click(findTestObject('Object Repository/Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/button_Hitung'))

    WebUI.findWebElements(findTestObject('Object Repository/Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/h3_Rp 36.000.000'), 
        0)

    WebUI.findWebElements(findTestObject('Object Repository/Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/div_Harga Properti Maksimal KamuRp 36.000.0_db86bc'), 
        0)

    //WebUI.takeElementScreenshot(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/column perhitungan'))
    
	//WebUI.takeFullPageScreenshot()
    
	String result = WebUI.getText(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/angka hasil perhitungan'))

    long Actual_result = Long.parseLong(result.replaceAll('[^\\d]', ''))

    //def double intActual_result = Double.parseDouble(Actual_result)
    double intPemasukan = Double.parseDouble(Pemasukan)

    double intPengeluaran = Double.parseDouble(Pengeluaran)

    double intJangka_Waktu = Double.parseDouble(Jangka_Waktu)

    long Hasil_Perhitungan = (intPemasukan - intPengeluaran) * ((intJangka_Waktu * 12) / 3)

    //long Hasil_Perhitungan = 'Rp ' + Hasil_Perhitungan
    WebUI.verifyEqual(Actual_result, Hasil_Perhitungan)

    WebUI.takeElementScreenshot(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/column perhitungan'))

    //WebUI.verifyMatch(Actual_result, stringHasil_Perhitungan, false)
    WebUI.takeFullPageScreenshot()
} else {
    WebUI.verifyElementPresent(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/alert eror'), 
        0)

    WebUI.verifyElementNotClickable(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/button_Hitung'))


    WebUI.takeElementScreenshot(findTestObject('Step 1/Page_Hitung Harga Properti Maksimal  BTN Pr_37bba6/column perhitungan'))

    WebUI.takeFullPageScreenshot()
}

WebUI.closeBrowser()

