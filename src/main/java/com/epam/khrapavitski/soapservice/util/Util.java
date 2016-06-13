package com.epam.khrapavitski.soapservice.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.xerces.dom.ElementNSImpl;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.epam.khrapavitski.currency.GetCursOnDateXMLResponse.GetCursOnDateXMLResult;
import com.epam.khrapavitski.soapservice.pojo.Currency;

public class Util {

    public static XMLGregorianCalendar getXMLGregorianCalendarNow() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = null;
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        XMLGregorianCalendar now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        return now;
    }

    public static Date toDate(XMLGregorianCalendar calendar) {
        if (calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }

    public static List<Currency> parse(GetCursOnDateXMLResult result) {
        List<Currency> currencies = new ArrayList<>();
        List<Object> list = result.getContent();
        ElementNSImpl e = (ElementNSImpl) list.get(0);
        NodeList nodeList = e.getElementsByTagName("ValuteCursOnDate");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Currency currency = new Currency();
            Element element = (Element) nodeList.item(i);
            currency.setAbbreviation(element.getElementsByTagName("VchCode").item(0).getTextContent());
            currency.setName(element.getElementsByTagName("Vname").item(0).getTextContent());
            currency.setOfficialRate(new BigDecimal(element.getElementsByTagName("Vcurs").item(0).getTextContent()));
            currency.setScale(new Integer(element.getElementsByTagName("Vnom").item(0).getTextContent()));
            currencies.add(currency);
        }
        return currencies;
    }

}
