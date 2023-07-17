package org.demo.karavan;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JavaRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("timer:x")
                .setBody(simple("JAVA BODY"))
                .process(exchange -> {
                    int x = 0;
                    System.out.println((100 / x));
                }).log("x");
    }
}
