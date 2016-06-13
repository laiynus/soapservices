package com.epam.khrapavitski.soapservice.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.khrapavitski.currency.DailyInfo;
import com.epam.khrapavitski.currency.DailyInfoSoap;
import com.epam.khrapavitski.soapservice.service.CurrencyService;
import com.epam.khrapavitski.soapservice.util.Util;

@Component("saveCurrency")
public class SaveCurrency implements Task {

    @Autowired
    CurrencyService service;

    @Override
    public void execute() {
        DailyInfo soapService = new DailyInfo();
        DailyInfoSoap soap = soapService.getDailyInfoSoap();
        service.save(Util.parse(soap.getCursOnDateXML(Util.getXMLGregorianCalendarNow())));
    }

}
