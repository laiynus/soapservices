package com.epam.khrapavitski.soapservice.webservice;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.khrapavitski.soapservice.pojo.Currency;
import com.epam.khrapavitski.soapservice.service.CurrencyService;

public class CurrencySoapServiceImpl implements CurrencySoapService {

    @Autowired
    CurrencyService service;

    @Override
    public Currency[] getCurrentDayInfo() {
        List<Currency> list = service.readCurrentDay();
        Currency[] currencies = new Currency[list.size()];
        list.toArray(currencies);
        return currencies;
    }

    @Override
    public Currency getCurrencyByName(String abbreviation) {
        return service.getByAbbreviation(abbreviation);
    }

    @Override
    public Currency[] getExRatesByDay(Date date) {
        List<Currency> list = service.getExRatesByDay(date);
        Currency[] currencies = new Currency[list.size()];
        list.toArray(currencies);
        return currencies;
    }

    @Override
    public Currency getExrateByDayAndName(Date date, String abbreviation) {
        return service.getExRatesByDayAndName(date, abbreviation);
    }

}
