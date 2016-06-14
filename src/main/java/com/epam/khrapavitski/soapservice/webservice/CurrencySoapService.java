package com.epam.khrapavitski.soapservice.webservice;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.epam.khrapavitski.soapservice.pojo.Currency;

@WebService(endpointInterface = "com.epam.khrapavitski.soapservice.webservice.CurrencySoapService", serviceName = "currency")
public interface CurrencySoapService extends SoapWebService<Currency> {

    @WebMethod(operationName = "currencyByNameToday")
    Currency getCurrencyByName(@WebParam(name = "abbreviation") String name);

    @WebMethod(operationName = "exchangeRatesByDay")
    Currency[] getExRatesByDay(@WebParam(name = "date") Date date);

    @WebMethod(operationName = "currencyByDateAndName")
    Currency getExrateByDayAndName(@WebParam(name = "date") Date date,
            @WebParam(name = "abbreviation") String abbreviation);

}
