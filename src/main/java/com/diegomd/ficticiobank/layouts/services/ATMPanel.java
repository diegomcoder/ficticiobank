package com.diegomd.ficticiobank.layouts.services;

import com.diegomd.ficticiobank.layouts.components.LateralButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMPanel extends JPanel implements ActionListener {

    static final int ATM_WIDTH = 715;
    static final int ATM_HEIGHT = 515;
    static final Dimension SCREEN_SIZE = new Dimension(ATM_WIDTH, ATM_HEIGHT);
    LateralButton button;
    public ATMPanel() {

        this.setLayout(new BorderLayout());
        this.setFocusable(true);
        // this.addKeyListener(new AL());
        this.setPreferredSize(SCREEN_SIZE);
        this.setBackground(new Color(0x4B4B4B));
        JLabel img = new JLabel(new ImageIcon("src/main/assets/atm-frame.png"));

        for (int i=1; i<=8; i++) {
            button = new LateralButton(i);
            button.addActionListener(this);
            this.add(button);
        }

        this.add(img);
    }

    private void contextAnalyser(int actionCommand) {
        switch (actionCommand) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println(3);
            case 4 -> System.out.println(4);
            case 5 -> System.out.println(5);
            case 6 -> System.out.println(6);
            case 7 -> System.out.println(7);
            case 8 -> System.out.println(8);
            default -> System.out.println("Err.: Button event unknown");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int actionCommand = Integer.parseInt(e.getActionCommand());
        contextAnalyser(actionCommand);
    }
}
