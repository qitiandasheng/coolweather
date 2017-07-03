package com.example.coolweather.gson;

/**
 * Created by root on 6/25/17.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
