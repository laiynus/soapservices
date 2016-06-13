package com.epam.khrapavitski.soapservice.webservice;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.khrapavitski.soapservice.pojo.Currency;

@WebService
public interface CurrencySoapService extends SoapWebService<Currency>{
    
    @WebMethod
    Currency getCurrencyByName(String name);
    
    @WebMethod
    Currency[] getExRatesByDay(Date date);

}
