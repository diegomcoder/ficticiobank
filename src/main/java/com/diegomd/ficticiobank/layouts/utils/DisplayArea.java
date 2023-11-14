package com.diegomd.ficticiobank.layouts.utils;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DisplayArea extends JPanel {
    public DisplayArea() {
        this.setBounds(107, 84,506,381);
        this.setBackground(new Color(0,0,0,0));
        this.setLayout(null);
    }

    public DisplayArea(boolean withBorderGuides) {
        this.setBounds(107, 84,506,381);
        this.setBackground(new Color(0,0,0,0));
        this.setLayout(null);

        if (withBorderGuides) {
            Border border = BorderFactory.createLineBorder(new Color(0xC300A5FF, true),1);
            this.setBorder(border);
        }
    }
}
