package com.diegomd.ficticiobank.layouts.components;

import javax.swing.*;
import java.awt.*;

public class LateralButton extends JButton {
    public LateralButton(int buttonNumber) {

        switch (buttonNumber) {
            case 1 -> this.setBounds(30,246,53, 35);
            case 2 -> this.setBounds(30,303,53, 35);
            case 3 -> this.setBounds(30,360,53, 35);
            case 4 -> this.setBounds(30,416,53, 35);
            case 5 -> this.setBounds(629,246,53, 35);
            case 6 -> this.setBounds(629,303,53, 35);
            case 7 -> this.setBounds(629,360,53, 35);
            case 8 -> this.setBounds(629,417,53, 35);
            default -> System.out.println("Err.: No such button number");
        }
        this.setActionCommand(String.valueOf(buttonNumber));
        this.setVisible(true);
    }
}
