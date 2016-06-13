package com.epam.khrapavitski.soapservice.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.khrapavitski.soapservice.service.GisMeteoService;
import com.epam.khrapavitski.weather.HHForecastResult;
import com.epam.khrapavitski.weather.Weather;
import com.epam.khrapavitski.weather.WeatherSoap;

@Component("saveWeather")
public class SaveWeather implements Task {

    @Autowired
    private GisMeteoService service;

    private String serial;

    private Integer city;

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    @Override
    public void execute() {
        WeatherSoap soap = new Weather().getWeatherSoap();
        HHForecastResult result = soap.getHHForecast(serial, city);
        service.save(result.getData().getHHForecast());
    }

}
