package com.diegomd.ficticiobank.layouts;

import com.diegomd.ficticiobank.layouts.components.LateralButton;
import com.diegomd.ficticiobank.layouts.services.ATMStartMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM extends JFrame {
    public ATM() {
        this.add(new StarterScreen());
    }
}