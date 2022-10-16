package com.task.pages;

import com.task.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//div[@class='VfPpkd-Bz112c-RLmnJb'])[1]")
    public WebElement sourceLanguageArrow;

    @FindBy(xpath = "(//input[@class='yFQBKb'])[1]")
    public WebElement sourceLanguageInput;

    @FindBy(xpath = "(//div[@class='vSUSRc'])[2]")
    public WebElement SourceLanguage;

    @FindBy(xpath = "(//div[@class='VfPpkd-Bz112c-RLmnJb'])[3]")
    public WebElement translationLanguageArrow;

    @FindBy(xpath = "(//input[@class='yFQBKb'])[2]")
    public WebElement translationLanguageInput;

    @FindBy(xpath = "(//div[@class='vSUSRc'])[4]")
    public WebElement translationLanguage;

    @FindBy(xpath = "//textarea[@aria-label='Source text']") //
    public WebElement initialTextInput;

    @FindBy(xpath = "(//div[@class='VfPpkd-Bz112c-RLmnJb'])[2]")
    public WebElement swappingBtn;

    @FindBy(xpath = "//span[@class='ryNqvb']")
    public WebElement resultGoogle;




}
