package com.bojan.weatherdashboard.service;

import com.bojan.weatherdashboard.configuration.WeatherApiProperties;
import com.bojan.weatherdashboard.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class WeatherService {

    private static final Logger logger = Logger.getLogger(WeatherService.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WeatherApiProperties weatherApiProperties;

    private static final String CURRENT_WEATHER_ENDPOINT = "/current.json?q=";

    public WeatherResponse getCurrentWeather(String location) {
        String url = weatherApiProperties.getUrl() + CURRENT_WEATHER_ENDPOINT + location + "&key=" + weatherApiProperties.getKey();

        logger.info("Calling WeatherAPI: " + url);

        // Log the raw response
        String response = restTemplate.getForObject(url, String.class);
        logger.info("API Response: " + response);

        return restTemplate.getForObject(url, WeatherResponse.class);
    }

}
