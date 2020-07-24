package com.webpage.checker;

public enum Checker {
    THREE_BEDROOM("https://www.vacationinsouthhaven.com/vacation-rental-home.asp?PageDataID=160236"),
    TWO_BEDROOM("https://www.vacationinsouthhaven.com/vacation-rental-home.asp?PageDataID=168702");

    private final String url;

    Checker(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
