package com.learn.webservice.soap;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.learn.webservice.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}