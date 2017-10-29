package com.learn.webservice.soap;

public class Instrument {
    private long id;
    private String esmpId;
    private String sedol;
    private Price price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEsmpId() {
        return esmpId;
    }

    public void setEsmpId(String esmpId) {
        this.esmpId = esmpId;
    }

    public String getSedol() {
        return sedol;
    }

    public void setSedol(String sedol) {
        this.sedol = sedol;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
