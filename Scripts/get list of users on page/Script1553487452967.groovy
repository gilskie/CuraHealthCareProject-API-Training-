import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

response = WS.sendRequest(findTestObject('Get list of users on page', [('page') : '2']))

//responseStatus = WS.verifyResponseStatusCode(response, 200)
WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'page', '2')

WS.verifyElementPropertyValue(response, 'data[0].first_name', 'Eve')

WS.verifyElementPropertyValue(response, 'data[0].last_name', 'Holt')

WS.verifyElementPropertyValue(response, 'data[0].avatar', 'https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg')

