package com.learn.webservice.soap;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
        Endpoint.publish("http://localhost:9999/ws/instruments", new InstrumentServiceImpl());

    }
}
