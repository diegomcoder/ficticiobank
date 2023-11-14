package com.diegomd.ficticiobank.layouts.utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DisplayHeader extends JLabel {
    public DisplayHeader(String innerText) {
        this.setBounds(0,0,506,30);
        this.setText(innerText);
        this.setFont(new Font("Arial", Font.BOLD, 18));

        this.setBackground(new Color(0xC6FDFD));
        this.setOpaque(true);
        this.setLayout(null);
        this.setBorder(new EmptyBorder(0,10,0,0));
    }
}
