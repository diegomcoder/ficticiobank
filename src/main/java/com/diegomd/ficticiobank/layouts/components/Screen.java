package com.diegomd.ficticiobank.layouts.components;

import javax.swing.*;
import java.awt.*;

public class Screen extends DisplayArea {
    JLabel screen;
    Image screenBgImage;
    public Screen(String imagePath) {
        screen = new JLabel();
        setBounds(103,82, getWidth(), getHeight());
        screenBgImage = new ImageIcon(imagePath).getImage()
                .getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        screen.setIcon(new ImageIcon(screenBgImage));
        screen.setBounds(0,0, getWidth(), getHeight());
        screen.setVerticalAlignment(JLabel.TOP);
        screen.setHorizontalAlignment(JLabel.CENTER);
        add(screen);
    }

    public void redesign(String imgPath) {
        screenBgImage = new ImageIcon(imgPath).getImage()
                .getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        screen.setIcon(new ImageIcon(screenBgImage));
        revalidate();
        repaint();
    }
}
