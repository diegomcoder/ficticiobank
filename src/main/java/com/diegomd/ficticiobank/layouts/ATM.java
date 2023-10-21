package com.diegomd.ficticiobank.layouts;

import com.diegomd.ficticiobank.layouts.components.LateralButton;
import com.diegomd.ficticiobank.layouts.services.ATMStartMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM extends JFrame implements ActionListener {
    public ATM() {
        this.add(new ATMStartMenu());

        for (int i=1; i<=8; i++) {
            LateralButton button = new LateralButton(i);
            button.addActionListener(this);
            this.add(button);
        }

        // ATM Window should be configured at the end to work properly
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(735, 556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("FicticioBank ATM");
        this.getContentPane().setBackground(new Color(0x73000000, true));
        JLabel img = new JLabel(new ImageIcon("src/main/assets/atm-frame.png"));
        img.setHorizontalAlignment(JLabel.LEFT);
        img.setBounds(0,0,720,556);
        this.add(img);
        this.setVisible(true);
    }

    private void buttonsHandeler(int btnNumber) {
        switch (btnNumber) {
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
        buttonsHandeler((Integer.parseInt(e.getActionCommand())));
    }
}