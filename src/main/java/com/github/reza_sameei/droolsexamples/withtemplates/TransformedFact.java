package com.github.reza_sameei.droolsexamples.withtemplates;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Optional;

public interface TransformedFact extends WithDate {

    String getId();

    Optional<String> getTargetGroup();

    Optional<OffsetDateTime> getEventTime();

    Date getEventDate();

    String getXmlStudy();

    String getXmlMdv();

    String getXmlSubjectOID();

    String getXmlSiteId();

    String getXmlPatientId();

    String getTransformedFactTypeId();

    // ===

    GenericRef getCDChunkRef();

    GenericRef getTransformedFactTypeRef();

    GenericRef getCDChunkSetRef();

    GenericRef getDataDefSetRef();

}
