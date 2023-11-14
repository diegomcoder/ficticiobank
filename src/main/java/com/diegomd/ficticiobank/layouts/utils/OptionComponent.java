package com.diegomd.ficticiobank.layouts.utils;

import javax.swing.*;
import java.awt.*;

public class OptionComponent extends JPanel {
    public OptionComponent(int nextToBtnNumber, String innerText) {
        JLabel imageContainer = new JLabel();
        JLabel textContainer = new JLabel();

        if (nextToBtnNumber > 0 && nextToBtnNumber <= 4) {
            imageContainer.setIcon(new ImageIcon("assets/option-L.png"));
            switch (nextToBtnNumber) {
                case 1 -> this.setBounds(0,0,248,50);
                case 2 -> this.setBounds(0,58, 248, 50);
                case 3 -> this.setBounds(0,115, 248, 50);
                default -> this.setBounds(0,172, 248, 50);
            }
        } else {
            imageContainer.setIcon(new ImageIcon("assets/option-R.png"));
            switch (nextToBtnNumber) {
                case 5 -> this.setBounds(258,0,248,50);
                case 6 -> this.setBounds(258,58, 248, 50);
                case 7 -> this.setBounds(258,115, 248, 50);
                default -> this.setBounds(258,172, 248, 50);
            }
        }

        imageContainer.setBounds(0,0,248,50);
        textContainer.setBounds(40,0,208,50);
        textContainer.setText(innerText);
        textContainer.setFont(new Font("Arial", Font.BOLD, 20));

        this.setLayout(null);
        this.setBackground(new Color(0,0,0,0));
        this.add(textContainer);
        this.add(imageContainer);
    }
}
