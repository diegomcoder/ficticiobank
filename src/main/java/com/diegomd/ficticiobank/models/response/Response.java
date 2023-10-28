package com.diegomd.ficticiobank.models.response;

import com.diegomd.ficticiobank.models.Section;
import com.diegomd.ficticiobank.models.request.Attachments;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class ResponseModel {
    public UUID atmClientId;
    public UUID sectionId;
    public String sectionOpenedAt;
    public String sectionClosedAt;
    public String sectionExpirationTime;
    public String currentContext;
    public String cpfHolderName;
    public byte tryAccessCont;
    public ArrayList<String> availableOptions;
    public ArrayList<Account> accounts;
// LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    public ResponseModel toNewSectionRequest(Section sectionCreated, String currentContext) {
        this.atmClientId = sectionCreated.getAtmClientId();
        this.sectionId = sectionCreated.getSectionId();
        this.sectionOpenedAt = sectionCreated.getSectionOpenedAt();
        this.sectionExpirationTime = LocalTime.of(0, 0, 30).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        this.currentContext = currentContext;
        this.availableOptions = new ArrayList<>(List.of("accessAccount","createAccount","closeSection"));
        return this;
    }
}
/*
// Obter a data e hora atual
LocalDateTime agora = LocalDateTime.now();

// Definir o formato desejado
DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

// Converter LocalDateTime para String
String dataComoString = agora.format(formatador);
System.out.println("LocalDateTime como String: " + dataComoString);

// Converter String para LocalDateTime
LocalDateTime dataComoLocalDateTime = LocalDateTime.parse(dataComoString, formatador);
*/