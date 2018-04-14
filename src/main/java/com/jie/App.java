package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.net.UnknownHostException;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo.xml"})
public class App {
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(App.class);
        app.run(args);
    }
}