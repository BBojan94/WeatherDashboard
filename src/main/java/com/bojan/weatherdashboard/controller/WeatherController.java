package com.bojan.weatherdashboard.controller;

import com.bojan.weatherdashboard.model.WeatherResponse;
import com.bojan.weatherdashboard.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{location}")
    public WeatherResponse getWeather(@PathVariable String location) {
        return weatherService.getCurrentWeather(location);
    }

}
