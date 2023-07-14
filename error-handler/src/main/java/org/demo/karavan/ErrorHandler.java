package org.demo.karavan;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ErrorHandler extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        errorHandler(deadLetterChannel("direct:error")
                .maximumRedeliveries(5)
                .redeliveryDelay(1000)
                .useOriginalBody());

        from("direct:error").log("${body}");
    }
}
