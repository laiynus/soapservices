package com.epam.khrapavitski.soapservice.webservice;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.khrapavitski.soapservice.pojo.Weather;
import com.epam.khrapavitski.soapservice.service.WeatherService;

@WebService(endpointInterface = "com.epam.khrapavitski.soapservice.webservice.WeatherSoapService", serviceName = "weather")
public class WeatherSoapServiceImpl implements WeatherSoapService {

    @Autowired
    WeatherService service;

    @Override
    @WebMethod(operationName = "weatherOnWeek")
    public Weather[] getCurrentDayInfo() {
        List<Weather> list = service.readCurrentDay();
        Weather[] weathers = new Weather[list.size()];
        list.toArray(weathers);
        return weathers;
    }

    @WebMethod
    public Weather getWeatherOnDay(Date date) {
        return service.getWeatherOnDay(date);
    }

}
