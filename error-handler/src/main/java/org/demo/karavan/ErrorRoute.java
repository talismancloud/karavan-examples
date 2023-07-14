package org.demo.karavan;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ErrorRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:error").log("${body}");
    }
}
