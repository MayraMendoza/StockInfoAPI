package com.careerdevs.StockInfoAPI.models;

public class StockModel {

    private String Symbol;
    private String AssetType;
    private String Name;
    private String Description;
    private String Exchange;
    private String Currency;
    private String Industry;

    public StockModel() {
    }

    public String getSymbol() {
        return Symbol;
    }

    public String getAssetType() {
        return AssetType;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getExchange() {
        return Exchange;
    }

    public String getCurrency() {
        return Currency;
    }

    public String getIndustry() {
        return Industry;
    }
}
