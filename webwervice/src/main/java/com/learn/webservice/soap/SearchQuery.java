package com.learn.webservice.soap;

public class SearchQuery {
    private long primaryKey;
    private String candidateKey;
    private String esmpId;
    private String ticker;
    private String sedol;

    public long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getCandidateKey() {
        return candidateKey;
    }

    public void setCandidateKey(String candidateKey) {
        this.candidateKey = candidateKey;
    }

    public String getEsmpId() {
        return esmpId;
    }

    public void setEsmpId(String esmpId) {
        this.esmpId = esmpId;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getSedol() {
        return sedol;
    }

    public void setSedol(String sedol) {
        this.sedol = sedol;
    }
}
