package com.diegomd.ficticiobank.layouts;

import javax.swing.*;
import java.util.UUID;

public class ATMFrame extends JFrame {
    private UUID atmId;
    ATMPanel panel;
    public ATMFrame() {
        atmId = UUID.randomUUID();
        panel = new ATMPanel(atmId);
        this.add(panel);
        this.setTitle("FicticioBank ATM");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
