package com.task.pages;

import com.task.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class TranslationPage extends BasePage{

    public TranslationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='itamenu']/span/div/a[1]")
    public WebElement screenKeyboard;

    @FindBy(xpath = "//*[@id='K16']")
    public WebElement upperCase;

    @FindBy(xpath = "//*[@id='K72']")
    public WebElement letterH;

    @FindBy(xpath = "//*[@id='K73']")
    public WebElement letterI;

    @FindBy(xpath = "//*[@id='K49']")
    public WebElement exclamationMark;
    public void typeHi(){

        screenKeyboard.click();
        upperCase.click();
        letterH.click();
        letterI.click();
        upperCase.click();
        exclamationMark.click();
    }

}
