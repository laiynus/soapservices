package com.epam.khrapavitski.soapservice.webservice;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.epam.khrapavitski.soapservice.pojo.Weather;

@WebService
public interface WeatherSoapService extends SoapWebService<Weather> {

    @WebMethod(operationName = "weatherOnDay")
    Weather[] getWeatherOnDay(@WebParam(name = "date") Date date);
    
    @WebMethod(operationName = "weatherAverageOnDay")
    Weather getAverageWeatherOnDay(@WebParam(name = "date") Date date);

}
