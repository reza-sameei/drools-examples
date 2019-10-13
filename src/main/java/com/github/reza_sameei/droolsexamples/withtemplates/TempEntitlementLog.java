package com.github.reza_sameei.droolsexamples.withtemplates;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Date;

public class TempEntitlementLog {

    private final String exprId;
    private final String factId;

    private final String xmlSiteId;
    private final String siteId;
    private final String contractId;

    private final Optional<OffsetDateTime> eventTime;
    private final String effDateFrom;
    private final String effDateTill;

    private final String treatmentArm;

    private final String financialProfileId;
    private final String currency;
    private final String amount;

    public TempEntitlementLog(
            String exprId,
            String factId,
            String xmlSiteId,
            String siteId,
            String contractId,
            Optional<OffsetDateTime> eventTime,
            String effDateFrom,
            String effDateTill,
            String treatmentArm,
            String financialProfileId,
            String currency,
            String amount
    ) {
        this.exprId = exprId;
        this.factId = factId;
        this.xmlSiteId = xmlSiteId;
        this.siteId = siteId;
        this.contractId = contractId;
        this.eventTime = eventTime;
        this.effDateFrom = effDateFrom;
        this.effDateTill = effDateTill;
        this.treatmentArm = treatmentArm;
        this.financialProfileId = financialProfileId;
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TempEntitlementLog{" +
                "exprId='" + exprId + '\'' +
                ", factId='" + factId + '\'' +
                ", xmlSiteId='" + xmlSiteId + '\'' +
                ", siteId='" + siteId + '\'' +
                ", contractId='" + contractId + '\'' +
                ", eventTime=" + eventTime +
                ", effDateFrom=" + effDateFrom +
                ", effDateTill=" + effDateTill +
                ", treatmentArm='" + treatmentArm + '\'' +
                ", financialProfileId='" + financialProfileId + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
