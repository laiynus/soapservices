package com.epam.khrapavitski.soapservice.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.epam.khrapavitski.soapservice.pojo.Currency;

public interface CurrencyDAO extends DAO<Currency> {

    List<Currency> readCurrentDay();

    Currency getByAbbreviation(String abbreviation);

    List<Currency> getExRatesByDay(Date date);

    Currency getExRatesByDayAndName(@Param("date") Date date, @Param("abbreviation") String abbreviation);
}
