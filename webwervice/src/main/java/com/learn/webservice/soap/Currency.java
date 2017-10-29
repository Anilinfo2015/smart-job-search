package com.learn.webservice.soap;

public class Currency {
    private long identifier;
    private String name;
    private long value;
    private String countryNane;

    public long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(long identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getCountryNane() {
        return countryNane;
    }

    public void setCountryNane(String countryNane) {
        this.countryNane = countryNane;
    }
}
