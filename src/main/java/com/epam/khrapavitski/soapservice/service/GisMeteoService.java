package com.epam.khrapavitski.soapservice.service;

import java.util.List;

import com.epam.khrapavitski.weather.HHForecast;

public interface GisMeteoService {

    void save(List<HHForecast> weatherList);

    void deleteExpareInfo();

}
