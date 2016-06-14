package com.epam.khrapavitski.soapservice.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epam.khrapavitski.soapservice.dao.WeatherDAO;
import com.epam.khrapavitski.soapservice.pojo.Weather;

@Service
@Transactional
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    WeatherDAO dao;

    @Override
    public void save(List<Weather> weatherList) {
        weatherList.forEach((Weather weather) -> dao.create(weather));
    }

    @Override
    public List<Weather> readCurrentDay() {
        return dao.readCurrentDay();
    }

    @Override
    public Weather[] getWeatherOnDay(Date date) {
        return dao.getWeatherOnDay(date);
    }

    @Override
    public Weather getAverageWeatherOnDay(Date date) {
        return dao.getAverageWeatherOnDay(date);
    }

}
