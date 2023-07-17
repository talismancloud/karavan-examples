package org.demo.karavan;

import org.apache.camel.builder.RouteConfigurationBuilder;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RouteConfiguration extends RouteConfigurationBuilder {

    @Override
    public void configuration() throws Exception {

//      Default route configuration
        routeConfiguration().errorHandler(
                deadLetterChannel("amqp:errors-queue") // produce message to Artemis
                        .maximumRedeliveries(5)
                        .redeliveryDelay(1000)
                        .useOriginalMessage()  // set if you want to have original Exchange payload
        );
//      Special route configuration
        routeConfiguration().id("specialConfig").errorHandler(
                deadLetterChannel("direct:error") // send to route
                        .maximumRedeliveries(5)
                        .redeliveryDelay(1000)
                        .useOriginalMessage()  // set if you want to have original Exchange payload
        );
    }

    @Override
    public void configure() throws Exception {
        from("direct:error")
                .log("ERROR BODY: ${body}");
    }
}
