package com.diegomd.ficticiobank.layouts.utils;

import javax.swing.*;

public class LateralButton extends JButton {
    public LateralButton(int buttonNumber) {
        switch (buttonNumber) {
            case 1 -> this.setBounds(35,248,53, 35);
            case 2 -> this.setBounds(35,305,53, 35);
            case 3 -> this.setBounds(35,362,53, 35);
            case 4 -> this.setBounds(35,419,53, 35);
            case 5 -> this.setBounds(633,248,53, 35);
            case 6 -> this.setBounds(633,305,53, 35);
            case 7 -> this.setBounds(633,362,53, 35);
            case 8 -> this.setBounds(633,419,53, 35);
            default -> System.out.println("Err.: No such button number");
        }
        this.setActionCommand(String.valueOf(buttonNumber));
        this.setVisible(true);
    }
}
