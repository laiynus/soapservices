package com.epam.khrapavitski.soapservice.dao;

import com.epam.khrapavitski.weather.HHForecast;

public interface GisMeteoDAO extends DAO<HHForecast> {
    void deleteExpareInfo();
}
