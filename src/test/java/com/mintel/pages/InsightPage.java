package com.mintel.pages;

import io.magentys.cinnamon.webdriver.elements.PageElement;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import static com.mintel.data.Data.COMMENT_TEXT;
import static io.magentys.cinnamon.webdriver.Timeouts.timeoutInSeconds;
import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.clickable;
import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.displayed;

public class InsightPage {

    @FindBy(xpath = "//*[@id=\"contentbuilderContainer\"]//*/h1")
    public PageElement titleText;
    @FindBy(id = "add-inline-comment-button")
    public PageElement inlineCommentSpeech;
    @FindBy(id = "reply-field")
    public PageElement commentBox;
    @FindBy(id = "save-comment")
    public PageElement saveCommentButton;
    @FindBy(css = "button[class$='comment']")
    public PageElement commentsButton;
    @FindBy(css = "span[class$='comment-first-span']")
    public PageElement savedComment;
    @FindBy(className = "inline-comment-body")
    public PageElement commenyBody;

    public InsightPage addComment() {
        titleText.doubleClick();
        inlineCommentSpeech.waitUntil(clickable).click();
        commentBox.waitUntil(displayed, timeoutInSeconds(10)).sendKeys(COMMENT_TEXT);
        saveCommentButton.click();
        commentsButton.click();
        return this;
    }

    public InsightPage checkComment() {
        savedComment.waitUntil(clickable).click();
        String text = commenyBody.waitUntil(displayed).getText();
        Assert.assertEquals(text, COMMENT_TEXT);
        return this;
    }
}