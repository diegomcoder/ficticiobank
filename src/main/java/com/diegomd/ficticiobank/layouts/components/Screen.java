package com.diegomd.ficticiobank.layouts.components;

import javax.swing.*;
import java.awt.*;

public class Screen extends DisplayArea {
    public Screen(String imagePath) {
        this.setBounds(0,0,this.getWidth(),this.getHeight());

        JLabel screen = new JLabel();

        Image screenBgImage = new ImageIcon(imagePath).getImage()
                .getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_SMOOTH);


        screen.setIcon(new ImageIcon(screenBgImage));
        screen.setBounds(0,0, this.getWidth(), this.getHeight());
        screen.setVerticalAlignment(JLabel.TOP);
        screen.setHorizontalAlignment(JLabel.CENTER);
        this.add(screen);
    }
}
