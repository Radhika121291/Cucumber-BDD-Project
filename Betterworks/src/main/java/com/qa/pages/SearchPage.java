package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class SearchPage {
    private WebDriver driver;
    //1.By Locators
    private By icon=By.xpath("//i[@class='icon-search-outlined ds-text-icon-inverse ci-nav-item ci-nav-hover']");
    private By input = By.xpath("//div[@class='ds-grow']/input");
    private By submit = By.xpath("//i[@class='icon-arrow_forward-filled ds-text-icon-mid ds-block ds-cursor-pointer']");
    //private By results=By.xpath("//p[@class='alphabetical-name']");
    //2.Constructor of page class
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    //3.Actions


    public void searchEnter(String query) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(icon).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(input).sendKeys(query);
        driver.findElement(submit).click();
    }

    public void searchResults(String query) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        boolean isSearchResultsVisible = driver.findElement(By.xpath("//p[contains(text(), '" + query + "')]")).isDisplayed();
        assertTrue("Search results do not contain " + query, isSearchResultsVisible);
    }
}
