package com.epam.khrapavitski.soapservice.dao;

import java.util.Date;
import java.util.List;

import com.epam.khrapavitski.soapservice.pojo.Weather;

public interface WeatherDAO extends DAO<Weather> {

    List<Weather> readCurrentDay();

    Weather[] getWeatherOnDay(Date date);
    
    Weather getAverageWeatherOnDay(Date date);

}
