package com.epam.khrapavitski.soapservice.webservice;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.khrapavitski.soapservice.pojo.Weather;
import com.epam.khrapavitski.soapservice.service.WeatherService;

public class WeatherSoapServiceImpl implements WeatherSoapService {

    @Autowired
    WeatherService service;

    @Override
    public Weather[] getCurrentDayInfo() {
        List<Weather> list = service.readCurrentDay();
        Weather[] weathers = new Weather[list.size()];
        list.toArray(weathers);
        return weathers;
    }

    @Override
    public Weather[] getWeatherOnDay(Date date) {
        return service.getWeatherOnDay(date);
    }

    @Override
    public Weather getAverageWeatherOnDay(Date date) {
        return service.getAverageWeatherOnDay(date);
    }

}
