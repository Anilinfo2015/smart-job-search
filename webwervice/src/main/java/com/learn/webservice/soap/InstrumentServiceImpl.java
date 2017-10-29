package com.learn.webservice.soap;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.learn.webservice.soap.InstrumentService")
public class InstrumentServiceImpl implements InstrumentService {

    @Override
    public ArrayList<Instrument> getPDIBulkInstruments(SearchQuery query) {
        ArrayList<Instrument> instruments = new ArrayList<>();

        Instrument instrument = new Instrument();
        instrument.setEsmpId("GOOOG");
        instrument.setId(1222);
        instrument.setSedol("GOOGSEDOL");

        Price price = new Price();
        price.setId(323232);
        price.setPrice(67);


        Currency currency = new Currency();
        currency.setCountryNane("US");
        currency.setIdentifier(11111);
        currency.setName("DOLAR");
        currency.setValue(1);
        price.setCurrency(currency);

        instrument.setPrice(price);
        instruments.add(instrument);
        instruments.add(instrument);
        instruments.add(instrument);
        instruments.add(instrument);
        instruments.add(instrument);
        instruments.add(instrument);
        instruments.add(instrument);

        return instruments;
    }
}
