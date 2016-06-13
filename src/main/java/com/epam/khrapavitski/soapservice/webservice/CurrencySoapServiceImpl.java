package com.epam.khrapavitski.soapservice.webservice;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.khrapavitski.soapservice.pojo.Currency;
import com.epam.khrapavitski.soapservice.service.CurrencyService;

@WebService(endpointInterface = "com.epam.khrapavitski.soapservice.webservice.CurrencySoapService", serviceName = "currency")
public class CurrencySoapServiceImpl implements CurrencySoapService {

    @Autowired
    CurrencyService service;

    @Override
    @WebMethod(operationName = "exchangeRatesToday")
    public Currency[] getCurrentDayInfo() {
        List<Currency> list = service.readCurrentDay();
        Currency[] currencies = new Currency[list.size()];
        list.toArray(currencies);
        return currencies;
    }

    @Override
    @WebMethod(operationName = "currencyByNameToday")
    public Currency getCurrencyByName(String abbreviation) {
        return service.getByAbbreviation(abbreviation);
    }

    @Override
    @WebMethod(operationName = "exchangeRatesByDay")
    public Currency[] getExRatesByDay(Date date) {
        List<Currency> list = service.getExRatesByDay(date);
        Currency[] currencies = new Currency[list.size()];
        return currencies;
    }

}
