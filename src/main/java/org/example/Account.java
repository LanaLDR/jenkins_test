package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (2 < name.length() && name.length() < 20 ) {
            if (name.length() - name.replace(" ", "").length() == 1){
               return name.startsWith(" ") || name.endsWith(" ") ? false : true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}