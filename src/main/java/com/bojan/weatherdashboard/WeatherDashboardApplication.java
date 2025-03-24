package com.bojan.weatherdashboard;

import com.bojan.weatherdashboard.configuration.WeatherApiProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableConfigurationProperties(WeatherApiProperties.class)
public class WeatherDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherDashboardApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
