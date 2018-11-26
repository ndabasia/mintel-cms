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

    public InsightDomain checkComment() {
        insightPage
                .checkComment();
        return this;
    }
}
