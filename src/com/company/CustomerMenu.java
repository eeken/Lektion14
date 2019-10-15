package com.company;

public enum CustomerMenu implements HasDescription{

    SHOW_ACCOUNT_DETAILS("Show Account Details"),
    INSERT_MONEY("Insert Money"),
    WITHDRAW_MONEY("Withdraw Money"),
    LOG_OUT("Log Out");

    private String description;

    CustomerMenu(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
