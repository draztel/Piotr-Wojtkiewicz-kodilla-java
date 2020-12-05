package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {
    public static final String ID_COOKIESACCEPTBUTTON = "u_0_h";
    public static final String ID_NEWACCOUNTBUTTON = "u_0_2";
    public static final String ID_WAIT_FOR = "reg_form_box";
    public static final String XPATH_BIRTHDAYFIELD = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTHFIELD = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEARFIELD = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        while(!driver.findElement(By.id(ID_COOKIESACCEPTBUTTON)).isDisplayed());

        WebElement cookiesAcceptButton = driver.findElement(By.id(ID_COOKIESACCEPTBUTTON));
        cookiesAcceptButton.click();

        WebElement newAccountButton = driver.findElement(By.id(ID_NEWACCOUNTBUTTON));
        newAccountButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(ID_WAIT_FOR)));

        WebElement birthdayField = driver.findElement(By.xpath(XPATH_BIRTHDAYFIELD));
        Select selectBirthday = new Select(birthdayField);
        selectBirthday.selectByIndex(3);

        WebElement monthField = driver.findElement(By.xpath(XPATH_MONTHFIELD));
        Select selectMonth = new Select(monthField);
        selectMonth.selectByIndex(1);

        WebElement yearField = driver.findElement(By.xpath(XPATH_YEARFIELD));
        Select selectYear = new Select(yearField);
        selectYear.selectByIndex(23);
    }
}
