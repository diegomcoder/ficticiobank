package com.diegomd.ficticiobank.models.request;

import java.util.UUID;

public class RequestModel {
    public UUID atmClientId;
    public UUID sectionId;
    public String currentContext;
    public String context;
    public Attachments attachments;

    public RequestModel toCreateNewSection(UUID atmClientId) {
        this.context = "newSection";
        this.atmClientId = atmClientId;
        return this;
    }
}
