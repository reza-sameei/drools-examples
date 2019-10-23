package com.github.reza_sameei.droolsexamples.withtemplates;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

public class SampleFact {

    private final String factId;

    private final Optional<OffsetDateTime> eventTime;

    private final List<SampleForm> sampleForms;

    private final SampleForm singleForm;

    public SampleFact(String factId, Optional<OffsetDateTime> eventTime, List<SampleForm> sampleForms, SampleForm singleForm) {
        this.factId = factId;
        this.eventTime = eventTime;
        this.sampleForms = sampleForms;
        this.singleForm = singleForm;
    }

    public String getFactId() {
        return factId;
    }

    public Optional<OffsetDateTime> getEventTime() {
        return eventTime;
    }

    public List<SampleForm> getSampleForms() {
        return sampleForms;
    }

    public SampleForm getSingleForm() {
        return singleForm;
    }

    public static class SampleForm {
        private final List<SampleGroup> sampleGroups;
        private final SampleGroup singleGroup;

        public SampleForm(List<SampleGroup> sampleGroups, SampleGroup singleGroup) {
            this.sampleGroups = sampleGroups;
            this.singleGroup = singleGroup;
        }

        public List<SampleGroup> getSampleGroups() {
            return sampleGroups;
        }

        public SampleGroup getSingleGroup() {
            return singleGroup;
        }
    }

    public static class SampleGroup {
        private final String sampleValue;

        public String getSampleValue() {
            return sampleValue;
        }

        public SampleGroup(String sampleValue) {
            this.sampleValue = sampleValue;

        }
    }

}
