package org.demo.karavan;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MainRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("timer:x")
                .setBody(constant("HELLO ERROR"))
                .process(exchange -> {
                    int x = 0;
                    System.out.println((100 / x));
                }).log("x");
    }
}
