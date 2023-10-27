package com.diegomd.ficticiobank.layouts.constants;

import javax.xml.xpath.XPath;

public enum Images {
    FIRST_SCREEN("src/main/assets/atm-first-screen.png"),
    ENTRY_MENU("src/main/assets/atm-main-menu.png"),
    ATM_BODY("src/main/assets/atm-frame.png"),
    ENTER_CPF("src/main/assets/I-01.png"),
    CHOOSE_ACCOUNT_TYPE("src/main/assets/I-02.png"),
    ENTER_PASSWORD("src/main/assets/I-03.png"),
    ENTER_VALUE("src/main/assets/I-04.png"),
    ENTER_FULL_NAME("src/main/assets/I-05.png"),
    REGISTER_PASSWORD("src/main/assets/I-06.png"),
    ENTER_RECIPIENT_ID("src/main/assets/I-07.png"),
    ENTER_ACCOUNT_NUMBER("src/main/assets/I-08.png"),
    ENTER_PASSWORD_RECOVER_TOKEN("src/main/assets/I-09.png"),
    INCORRECT_PASSWORD("src/main/assets/E-01.png"),
    NO_LINKED_ACCOUNT("src/main/assets/E-02.png"),
    ACCESS_BLOCKED("src/main/assets/E-03.png"),
    ACCOUNT_TYPE_ALREADY_EXISTS("src/main/assets/E-04.png"),
    ACCOUNT_LIMIT_PER_CPF_EXCEEDED("src/main/assets/E-05.png"),
    INVALID_PASSWORD("src/main/assets/E-06.png"),
    NO_STATEMENT("src/main/assets/E-07"),
    ACCOUNT_DOES_NOT_EXISTS("src/main/assets/E-08"),
    NO_CASH_ENOUGH("src/main/assets/E-09"),
    INCORRECT_ACCOUNT_NUMBER("src/main/assets/E-10"),
    ACCOUNT_WITH_POSITIVE_BALANCE("src/main/assets/E-11"),
    ACCESS_NOT_BLOCKED("src/main/assets/E-12"),
    NO_CONNECTION_TO_SERVER("src/main/assets/E-13"),
    ACCOUNT_CREATED_SUCCESSFULLY("src/main/assets/S-01"),
    OPERATION_DONE_SUCCESSFULLY("src/main/assets/S-02"),
    PASSWORD_CHANGED_SUCCESSFULLY("src/main/assets/S-03"),
    ACCESS_REGULARIZED_SUCCESSFULLY("src/main/assets/S-04");

    final String path;

    Images(String path) {
        this.path = path;
    }
}
