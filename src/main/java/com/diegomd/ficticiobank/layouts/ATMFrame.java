package com.diegomd.ficticiobank.layouts;

import com.diegomd.ficticiobank.layouts.services.ATMPanel;

import javax.swing.*;
import java.awt.*;

public class ATMFrame extends JFrame {
    ATMPanel panel;
    public ATMFrame() {
        panel = new ATMPanel();
        this.add(panel);
        this.setTitle("FicticioBank ATM");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
