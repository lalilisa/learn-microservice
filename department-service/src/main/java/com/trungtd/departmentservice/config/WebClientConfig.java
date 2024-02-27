package com.trungtd.departmentservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient employeeWebCClient() {
        return WebClient.builder()
                .baseUrl("http://employee-service")
                .build();
    }
}
