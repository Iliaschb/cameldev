package com.im.cameldev;

import org.apache.camel.builder.RouteBuilder;

public class Beispielklasse extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:beispielklasse?period=5000")
                .log("Hello World!");
    }
}
