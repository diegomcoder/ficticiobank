package com.diegomd.ficticiobank.layouts;

import com.diegomd.ficticiobank.layouts.components.DisplayArea;
import com.diegomd.ficticiobank.layouts.components.Screen;

public class StarterScreen extends DisplayArea {
    public StarterScreen() {
        this.add(new Screen("src/main/assets/ATM.png"));
    }
}
