package com.ortakat.consumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

@EnableDiscoveryClient
@SpringBootApplication
public class Consumer2Application {

    @Bean
    RouterFunction<?> routes(){
        return RouterFunctions.route(RequestPredicates.GET("/test"), r -> ServerResponse.ok().body("SUCCESS 2"));
    }


    public static void main(String[] args) {
        SpringApplication.run(Consumer2Application.class, args);
    }

}
