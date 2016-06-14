package com.epam.khrapavitski.soapservice.service;

import java.util.Date;
import java.util.List;

import com.epam.khrapavitski.soapservice.pojo.Weather;

public interface WeatherService {

    void save(List<Weather> weatherList);

    List<Weather> readCurrentDay();

    Weather[] getWeatherOnDay(Date date);
    
    Weather getAverageWeatherOnDay(Date date);

}
