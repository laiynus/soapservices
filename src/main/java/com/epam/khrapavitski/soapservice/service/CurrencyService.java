package com.epam.khrapavitski.soapservice.service;

import java.util.Date;
import java.util.List;

import com.epam.khrapavitski.soapservice.pojo.Currency;

public interface CurrencyService {
    
    void save(List<Currency> currency);

    List<Currency> readCurrentDay();
    
    Currency getByAbbreviation(String abbreviation);
    
    List<Currency> getExRatesByDay(Date date);
    
    Currency getExRatesByDayAndName(Date date, String abbreviation);
}
