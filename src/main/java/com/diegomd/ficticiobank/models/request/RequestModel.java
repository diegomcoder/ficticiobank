package com.diegomd.ficticiobank.models.request;

import java.util.UUID;

public class RequestModel {
    public UUID atmClientId;
    public UUID sectionId;
    public String currentContext;
    public String getContext;
    public Attachments attachments;
}
