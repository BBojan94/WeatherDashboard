package com.bojan.weatherdashboard.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {

    private Location location;
    private Current current;

    @Getter
    @Setter
    public static class Location {
        private String name;
        private String region;
        private String country;
        private double lat;
        private double lon;
        private String tz_id;
        private String localtime;
    }

    @Getter
    @Setter
    public static class Current {
        private double temp_c;
        private double temp_f;
        private int is_day;
        private Condition condition;
        private double wind_mph;
        private double wind_kph;
        private int humidity;
    }

    @Getter
    @Setter
    public static class Condition {
        private String text;
        private String icon;
    }

}
