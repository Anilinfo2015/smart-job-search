package com.learn.webservice;
import static spark.Spark.*;

public class FirstWebService {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");

    }
}
