package com.diegomd.ficticiobank.layouts.services;

import com.diegomd.ficticiobank.layouts.components.DisplayArea;
import com.diegomd.ficticiobank.layouts.components.Screen;

import javax.swing.*;

public class ATMStartMenu extends DisplayArea {

    public ATMStartMenu() {
        this.add(new Screen("src/main/assets/M.png"));
    }
}
