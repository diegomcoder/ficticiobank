package com.diegomd.ficticiobank.layouts.screens;

import com.diegomd.ficticiobank.layouts.utils.OptionComponent;
import com.diegomd.ficticiobank.layouts.utils.OptionsArea;
import com.diegomd.ficticiobank.layouts.utils.BankLogo;
import com.diegomd.ficticiobank.layouts.utils.DisplayArea;

public class MainMenu extends DisplayArea {
    public MainMenu() {
        OptionsArea optionsArea = new OptionsArea();
        optionsArea.add(new OptionComponent(7, "Acessar conta"));
        optionsArea.add(new OptionComponent(8, "Abrir nova conta"));

        //this.add(new DisplayHeader("Usuário: " + "Sr. Foobar"));
        this.add(new BankLogo());

        this.add(optionsArea);
    }
}
