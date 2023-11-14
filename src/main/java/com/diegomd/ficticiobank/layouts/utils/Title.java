package com.diegomd.ficticiobank.layouts.utils;

import javax.swing.*;
import java.awt.*;

public class Title extends JLabel {
    public Title(String text) {
        this.setBounds(0,53,506,40);
        this.setText(text);
        this.setFont(new Font("Arial", Font.BOLD, 40));

        this.setHorizontalAlignment(JLabel.CENTER);
        this.setForeground(new Color(0xD1FFFF));

        this.setLayout(null);
    }
}
