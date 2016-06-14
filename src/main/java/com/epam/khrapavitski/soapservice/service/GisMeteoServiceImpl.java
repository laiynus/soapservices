package com.epam.khrapavitski.soapservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epam.khrapavitski.soapservice.dao.GisMeteoDAO;
import com.epam.khrapavitski.weather.HHForecast;

@Service
@Transactional
public class GisMeteoServiceImpl implements GisMeteoService {

    @Autowired
    GisMeteoDAO dao;

    @Override
    public void save(List<HHForecast> weatherList) {
        weatherList.forEach((HHForecast weather) -> dao.create(weather));
    }
    
    @Override
    public void deleteExpareInfo() {
        dao.deleteExpareInfo();
    }

}
