package com.diegomd.ficticiobank.layouts.utils;

import javax.swing.*;
import java.awt.*;

public class Subtitle extends JLabel {
    public Subtitle(String text) {
        this.setBounds(0,100,506,40);
        this.setText(text);
        this.setFont(new Font("Arial", Font.BOLD, 22));

        this.setHorizontalAlignment(JLabel.CENTER);
        this.setForeground(new Color(90, 142, 159));

        this.setLayout(null);
    }
}
