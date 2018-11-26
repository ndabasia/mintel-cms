package com.mintel.pages;

import io.magentys.cinnamon.webdriver.elements.PageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.textContains;

public class BpchPage {

    @FindBy(xpath = "//*[@title='Beauty Personal Care Household (BPCH)']")
    public PageElement bcphDashboardTitle;
    @FindBy(className = "insights-populate-table")
    public PageElement insightTable;

    public BpchPage bcphTitle() {
        bcphDashboardTitle.waitUntil(textContains("Beauty Personal Care Household (BPCH)"));
        return this;
    }

    public BpchPage selectInsight() {
        List<WebElement> tr_list = insightTable.findElements(By.cssSelector("tbody tr"));

        for (WebElement trElement : tr_list) {
            try {
                List<WebElement> td_list = trElement.findElements(By.tagName("a"));

                for (WebElement tdElement : td_list) {
                    if (tdElement.isEnabled()) {
                        tdElement.findElement(By.xpath("//*[contains(@id, 'yui')]//*/table/tbody//*/a")).click();
                    }
                }
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
            }
        }
        return this;
    }

}