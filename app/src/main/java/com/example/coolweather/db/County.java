package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by root on 6/23/17.
 */

public class County extends DataSupport {
    private String countyName;
    private int cityId;
    private int weatherId;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
}
