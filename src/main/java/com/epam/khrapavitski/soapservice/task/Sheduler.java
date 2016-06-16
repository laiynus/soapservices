package com.epam.khrapavitski.soapservice.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Sheduler {

    @Autowired
    @Qualifier("saveWeather")
    Task saveWeather;

    @Autowired
    @Qualifier("saveCurrency")
    Task saveCurrency;

    @Scheduled(cron = "0 0 12 * * ?")
    public void saveWeather() {
        saveWeather.execute();
    }

    @Scheduled(cron = "0 0 12 * * ?")
    public void saveCurrency() {
        saveCurrency.execute();
    }
}
