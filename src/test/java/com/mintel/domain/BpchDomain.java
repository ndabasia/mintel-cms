package com.mintel.domain;

import com.google.inject.Inject;
import com.mintel.pages.BpchPage;

public class BpchDomain {

    @Inject
    private BpchPage bpchPage;

    public BpchDomain clickInsight()  {
        bpchPage
                .bcphTitle()
                .selectInsight();
        return this;
    }
}
