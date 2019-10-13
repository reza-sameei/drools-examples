package com.github.reza_sameei.droolsexamples.withtemplates;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Optional;

public class MappedFactImpl implements MappedFact {

    private final String id;
    private final Optional<String> targetGroup;
    private final Optional<OffsetDateTime> eventTime;
    private final String xmlStudy;
    private final String xmlMdv;
    private final String xmlSubjectOID;
    private final String xmlSiteId;
    private final String xmlPatientId;
    private final String transformedTactTypeId;
    private final String treatmentArm;

    public MappedFactImpl(
            String id,
            Optional<String> targetGroup,
            Optional<OffsetDateTime> eventTime,
            String xmlStudy,
            String xmlMdv,
            String xmlSubjectOID,
            String xmlSiteId,
            String xmlPatientId,
            String transformedTactTypeId,
            String treatmentArm) {
        this.id = id;
        this.targetGroup = targetGroup;
        this.eventTime = eventTime;
        this.xmlStudy = xmlStudy;
        this.xmlMdv = xmlMdv;
        this.xmlSubjectOID = xmlSubjectOID;
        this.xmlSiteId = xmlSiteId;
        this.xmlPatientId = xmlPatientId;
        this.transformedTactTypeId = transformedTactTypeId;
        this.treatmentArm = treatmentArm;
    }

    @Override
    public String getTreatmentArm() {
        return treatmentArm;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Optional<String> getTargetGroup() {
        return targetGroup;
    }

    @Override
    public Optional<OffsetDateTime> getEventTime() {
        return eventTime;
    }

    @Override
    public String getXmlStudy() {
        return xmlStudy;
    }

    @Override
    public String getXmlMdv() {
        return xmlMdv;
    }

    @Override
    public String getXmlSubjectOID() {
        return xmlSubjectOID;
    }

    @Override
    public String getXmlSiteId() {
        return xmlSiteId;
    }

    @Override
    public String getXmlPatientId() {
        return xmlPatientId;
    }

    @Override
    public String getTransformedFactTypeId() {
        return transformedTactTypeId;
    }

    @Override
    public GenericRef getCDChunkRef() {
        return null;
    }

    @Override
    public GenericRef getTransformedFactTypeRef() {
        return null;
    }

    @Override
    public GenericRef getCDChunkSetRef() {
        return null;
    }

    @Override
    public GenericRef getDataDefSetRef() {
        return null;
    }

    @Override
    public Date getEventDate() {
        return getEventTime().isPresent()
                ? Date.from(getEventTime().get().toInstant())
                : null;
    }

    @Override
    public Date getDate() {
        return getEventDate();
    }

    @Override
    public String toString() {
        return "MappedFactImpl{" +
                "id='" + id + '\'' +
                ", targetGroup=" + targetGroup +
                ", eventTime=" + eventTime +
                ", xmlStudy='" + xmlStudy + '\'' +
                ", xmlMdv='" + xmlMdv + '\'' +
                ", xmlSubjectOID='" + xmlSubjectOID + '\'' +
                ", xmlSiteId='" + xmlSiteId + '\'' +
                ", xmlPatientId='" + xmlPatientId + '\'' +
                ", transformedTactTypeId='" + transformedTactTypeId + '\'' +
                ", treatmentArm='" + treatmentArm + '\'' +
                '}';
    }
}
