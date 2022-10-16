package com.task.step_definitions;

import com.task.pages.TranslationPage;
import com.task.utilities.BrowserUtils;
import com.task.utilities.ConfigurationReader;
import com.task.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class ScenarioStepDefs {


    TranslationPage translationPage = new TranslationPage();

    String path = "TakeHomeChallenge.xlsx";

    // to read from excel we need to load it to FileInputStream
    FileInputStream fileInputStream = new FileInputStream(path);
    //workbook>sheet>row>cell

    // <1> Create a workbook
    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

    // <2> We need to get specific sheet from currently opened workbook
    XSSFSheet sheet = workbook.getSheet("Translation");

    public ScenarioStepDefs() throws IOException {
    }

    @Given("user is on the google translation page")
    public void user_is_on_the_google_translation_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("translation_url"));


    }
    @Given("user select the source language")
    public void user_select_the_source_language(){

        String sourceLanguage = ""+sheet.getRow(1).getCell(0);
        translationPage.sourceLanguageArrow.click();
        translationPage.sourceLanguageInput.sendKeys(sourceLanguage);
        translationPage.SourceLanguage.click();

    }
    @Then("user select the translation language")
    public void user_select_the_translation_language() {

        String translationLanguage = ""+sheet.getRow(1).getCell(1);
        translationPage.translationLanguageArrow.click();
        translationPage.translationLanguageInput.sendKeys(translationLanguage);
        translationPage.translationLanguage.click();
        BrowserUtils.waitFor(2);

    }
    @Then("user enter initial text in the input field")
    public void user_enter_initial_text_in_the_input_field() {

        String text = ""+sheet.getRow(1).getCell(2);
        translationPage.initialTextInput.sendKeys(text);

    }
    @Then("expected result is verified correct")
    public void expected_result_is_verified_correct() {

        BrowserUtils.waitFor(1);
        String expectedResult = ""+sheet.getRow(1).getCell(3);
        String result = translationPage.resultGoogle.getText();
        Assert.assertEquals(expectedResult,result);
    }

    @When("user click swap languages button")
    public void user_click_swap_languages_button() {

        translationPage.swappingBtn.click();
    }
    @Then("user verify the result")
    public void user_verify_the_result() {

      String actual = ""+sheet.getRow(1).getCell(3);
      String expected = translationPage.resultGoogle.getText();
      Assert.assertEquals(actual,expected);
      BrowserUtils.waitFor(2);
    }

    @Then("user clear the input field")
    public void user_clear_the_input_field() {
        translationPage.initialTextInput.clear();
    }
    @Then("user select screen keyboard and type Hi!")
    public void user_select_screen_keyboard_and_type_Hi() {

        translationPage.typeHi();


    }



}
