package com.diegomd.ficticiobank.layouts.services;

import com.diegomd.ficticiobank.layouts.components.DisplayArea;
import com.diegomd.ficticiobank.layouts.components.Screen;

public class AtmFirstScreen extends DisplayArea {
    public AtmFirstScreen() {
        this.add(new Screen("src/main/assets/atm-first-screen.png"));
    }
}
