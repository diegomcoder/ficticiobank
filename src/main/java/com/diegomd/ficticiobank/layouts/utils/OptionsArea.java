package com.diegomd.ficticiobank.layouts.utils;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class OptionsArea extends JPanel {
    public OptionsArea() {
        this.setBounds(0, (158),506,(381-158));
        this.setBackground(new Color(0,0,0,0));
        this.setLayout(null);
    }

    public OptionsArea(boolean withBorderGuides) {
        this.setBounds(0, (158),506,(381-158));
        this.setBackground(new Color(0,0,0,0));
        this.setLayout(null);

        if (withBorderGuides) {
            Border border = BorderFactory.createLineBorder(Color.RED, 1);
            this.setBorder(border);
        }
    }
}
