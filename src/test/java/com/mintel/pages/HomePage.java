package com.mintel.pages;

import io.magentys.cinnamon.webdriver.elements.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.textContains;

public class HomePage {

    @FindBy(className = "alfresco-debug-WidgetInfo")
    public PageElement dashboardTitle;
    @FindBy(xpath = "//*[contains(@id, 'default-toolbar')]//*/i")
    public PageElement elementSiteType;
    @FindBy(xpath = "//*[contains(@id, 'default-toolbar')]/div/form/div/div[1]/div/div[2]/div[1]")
    public PageElement contentSite;
    @FindBy(xpath = "//*[contains(@id, 'default-reports')]")
    public PageElement hubTable;

    public HomePage dashboardTitle() {
        dashboardTitle.waitUntil(textContains("Dashboard"));
        return this;
    }

    public HomePage clickSiteType() {
        elementSiteType.click();
        return this;
    }

    public HomePage selectContentSite() {
        contentSite.click();
        return this;
    }

    public HomePage selectHubType(String hubName) {
        List<WebElement> tr_list = hubTable.findElements(By.cssSelector("tbody tr"));

        for (WebElement trElement : tr_list) {
            try {
                List<WebElement> td_list = trElement.findElements(By.tagName("h3"));

                for (WebElement tdElement : td_list) {
                    String hubTypes = tdElement.getText();
                    if (hubTypes.equals(hubName)) {
                        tdElement.findElement(By.className("theme-color-1")).click();
                    }
                }
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
            }
        }
        return this;
    }

}