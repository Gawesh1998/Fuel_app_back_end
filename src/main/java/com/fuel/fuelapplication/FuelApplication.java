package com.fuel.fuelapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class FuelApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuelApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer crosConfigure(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/fuel_application_backend").allowedOrigins("https://localhost:8081");
            }
        };
    }

}
