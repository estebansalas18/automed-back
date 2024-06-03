package com.gulteking.mqttbackendserver.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:51901", "https://auto-med-qhr8tb.flutterflow.app",
                        "https://app.flutterflow.io")
                .allowedMethods("GET", "POST")
                .allowedHeaders("Content-Type")
                .allowCredentials(true);
    }
}