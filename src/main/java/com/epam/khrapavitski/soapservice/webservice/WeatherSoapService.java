package com.epam.khrapavitski.soapservice.webservice;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.khrapavitski.soapservice.pojo.Weather;

@WebService
public interface WeatherSoapService extends SoapWebService<Weather> {

    @WebMethod
    Weather getWeatherOnDay(Date date);

}
