package com.epam.khrapavitski.soapservice.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SoapWebService<T> {

    @WebMethod
    T[] getCurrentDayInfo();
}
