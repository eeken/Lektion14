package com.company;

public enum MainMenu implements HasDescription {

    ADD_ACCOUNT("Add Account"),
    DELETE_ACCOUNT("Delete Account"),
    SHOW_ACCOUNT_OVERVIEW("Show Account Overview"),
    QUIT("Quit");

    private String description;

    MainMenu(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}
