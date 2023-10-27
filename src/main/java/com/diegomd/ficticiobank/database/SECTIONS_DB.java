package com.diegomd.ficticiobank.database;

import com.diegomd.ficticiobank.models.Section;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SECTIONS_DB {
    private static final List<Section> sections = new ArrayList<>();

    public static void save(Section section) {
        sections.add(section);
    }

    public static Section findByAtmClientId(UUID atmClientId) {
        Section foundSection = null;
        for (Section section : sections) {
            if (section.getAtmClientId() == atmClientId) {
                foundSection = section;
                break;
            }
        }
        return foundSection;
    }
}
