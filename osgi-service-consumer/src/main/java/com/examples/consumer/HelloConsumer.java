package com.examples.consumer;

import com.examples.HelloService;

/**
 * Created by ka40215 on 2/20/16.
 */
public class HelloConsumer {
    private final HelloService helloService;

    public HelloConsumer(HelloService helloService) {
        this.helloService = helloService;
    }

    public void consumeHello() {
        helloService.hello();
    }
}
