package com.mintel.domain;

import com.google.inject.Inject;
import com.mintel.pages.InsightPage;

public class InsightDomain {

    @Inject
    private InsightPage insightPage;

    public InsightDomain addComment() {
        insightPage
                .addComment();
        return this;
    }

    public InsightDomain deleteComment() {
        insightPage
//                .openComment()
                .openCommentDropdown()
                .deleteComment();
        return this;
    }

    public InsightDomain checkCommentSaved() {
        insightPage
                .clickCommentsButton()
//                .openComment()
                .checkComment();
        return this;
    }

    public InsightDomain checkCommentDeleted() {
        insightPage
                .checkCommentDeletion();
        return this;
    }
}
