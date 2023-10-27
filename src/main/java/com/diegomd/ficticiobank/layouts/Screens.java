package com.diegomd.ficticiobank.layouts;

import com.diegomd.ficticiobank.layouts.components.Screen;

public class Screens {
    public static final Screen atmFirsScreen = new Screen("src/main/assets/atm-first-screen.png");
    public static final Screen atmMainMenu = new Screen("src/main/assets/atm-main-menu.png");
    public static final Screen atmBody = new Screen("src/main/assets/atm-frame.png");
    public static final Screen enterCpf = new Screen("src/main/assets/I-01.png");
    public static final Screen chooseAccountType = new Screen("src/main/assets/I-02.png");
    public static final Screen enterPassword = new Screen("src/main/assets/I-03.png");
    public static final Screen enterValue = new Screen("src/main/assets/I-04.png");
    public static final Screen enterFullName = new Screen("src/main/assets/I-05.png");
    public static final Screen registerPassword = new Screen("src/main/assets/I-06.png");
    public static final Screen enterRecipientData = new Screen("src/main/assets/I-07.png");
    public static final Screen enterAccountNumber = new Screen("src/main/assets/I-08.png");
    public static final Screen enterPasswordRecoverToken = new Screen("src/main/assets/I-09.png");
    public static final Screen incorrectPassword = new Screen("src/main/assets/E-01.png");
    public static final Screen noLinkedAccount = new Screen("src/main/assets/E-02.png");
    public static final Screen accessBlocked = new Screen("src/main/assets/E-03.png");
    public static final Screen accountTypeAlreadyExists = new Screen("src/main/assets/E-04.png");
    public static final Screen accountLimitExceeded = new Screen("src/main/assets/E-05.png");
    public static final Screen invalidPassword = new Screen("src/main/assets/E-06.png");
    public static final Screen noStatement = new Screen("src/main/assets/E-07.png");
    public static final Screen accountDoesNotExists = new Screen("src/main/assets/E-08");
    public static final Screen noEnoughBalance = new Screen("src/main/assets/E-09.png");
    public static final Screen incorrectAccountNumber = new Screen("src/main/assets/E-10.png");
    public static final Screen accountWithPositiveBalance = new Screen("src/main/assets/E-11.png");
    public static final Screen noBlockedAccess = new Screen("src/main/assets/E-12.png");
    public static final Screen noConnectionToServer = new Screen("src/main/assets/E-13.png");
    public static final Screen accountCreatedSuccessfully = new Screen("src/main/assets/S-01.png");
    public static final Screen operationDoneSuccessfully = new Screen("src/main/assets/S-02.png");
    public static final Screen passwordChangedSuccessfully = new Screen("src/main/assets/S-03.png");
    public static final Screen accessSuccessfullyRegularized = new Screen("src/main/assets/S-04.png");
}
