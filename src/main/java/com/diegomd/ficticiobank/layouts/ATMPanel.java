package com.diegomd.ficticiobank.layouts;

import com.diegomd.ficticiobank.layouts.components.LateralButton;
import com.diegomd.ficticiobank.layouts.components.Screen;
import com.diegomd.ficticiobank.models.ATMModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.UUID;

public class ATMPanel extends JPanel implements ActionListener {

    static final int ATM_WIDTH = 715;
    static final int ATM_HEIGHT = 515;
    static final Dimension SCREEN_SIZE = new Dimension(ATM_WIDTH, ATM_HEIGHT);
    Screen screen;
    LateralButton button;
    ATMModel model;

    public ATMPanel(UUID atmId) {
        model = new ATMModel(atmId);

        setPreferredSize(SCREEN_SIZE);
        setLayout(null);
        setFocusable(true);
        // this.addKeyListener(new AL());
        setBackground(new Color(0x4B4B4B));

        for (int i=1; i<=8; i++) {
            button = new LateralButton(i);
            button.addActionListener(this);
            add(button);
        }

        screen = new Screen("src/main/assets/atm-first-screen.png");
        this.add(screen);

        JLabel atmBodyImage = new JLabel(new ImageIcon("src/main/assets/atm-frame.png"));
        atmBodyImage.setBounds(0, 0, ATM_WIDTH, ATM_HEIGHT);
        add(atmBodyImage);
    }

    private void contextAnalyser(int actionCommand) {
        switch (actionCommand) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println(3);
            case 4 -> System.out.println(4);
            case 5 -> System.out.println(5);
            case 6 -> System.out.println(6);
            case 7 -> screen.redesign("src/main/assets/I-01.png");
            case 8 -> screen.redesign("src/main/assets/atm-main-menu.png");
            default -> System.out.println("Err.: Button event unknown");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int actionCommand = Integer.parseInt(e.getActionCommand());
        try {
            model.handleActionCommand(screen, actionCommand);
        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        //contextAnalyser(actionCommand);
    }
}
