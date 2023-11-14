package com.diegomd.ficticiobank.layouts.utils;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class InfoArea extends JPanel {
    public InfoArea() {
        this.setLayout(new BorderLayout());
        this.setBounds(0, 0,506,155);
        this.setBackground(new Color(0,0,0,0));
    }

    public InfoArea(boolean withBorderGuides) {
        this.setLayout(new BorderLayout());
        this.setBounds(0, 0,506,155);
        this.setBackground(new Color(0,0,0,0));

        if (withBorderGuides) {
            Border border = BorderFactory.createLineBorder(Color.PINK, 1);
            this.setBorder(border);
        }
    }
}
