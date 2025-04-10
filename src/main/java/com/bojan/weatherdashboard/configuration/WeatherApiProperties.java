package com.bojan.weatherdashboard.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "weatherapi")
public class WeatherApiProperties {

    private String key;
    private String url;

}
