package com.epam.khrapavitski.soapservice.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epam.khrapavitski.soapservice.dao.CurrencyDAO;
import com.epam.khrapavitski.soapservice.pojo.Currency;

@Service
@Transactional
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyDAO dao;

    @Override
    public void save(List<Currency> currencyList) {
        currencyList.forEach((Currency currency) -> dao.create(currency));
    }

    @Override
    public List<Currency> readCurrentDay() {
        return dao.readCurrentDay();
    }

    @Override
    public Currency getByAbbreviation(String abbreviation) {
        return dao.getByAbbreviation(abbreviation);
    }

    @Override
    public List<Currency> getExRatesByDay(Date date) {
        return dao.getExRatesByDay(date);
    }

    @Override
    public Currency getExRatesByDayAndName(Date date, String abbreviation) {
        return dao.getExRatesByDayAndName(date, abbreviation);
    }

}
