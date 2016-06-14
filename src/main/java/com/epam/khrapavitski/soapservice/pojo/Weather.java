package com.epam.khrapavitski.soapservice.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "Weather")
@XmlAccessorType(XmlAccessType.FIELD)
public class Weather implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlTransient
    private Long id;

    @XmlElement
    private Date date;

    @XmlElement
    private Double temperature;

    @XmlElement
    private Integer humidity;

    @XmlElement
    private Double windSpeed;

    @XmlElement
    private Double pressure;

    public Weather() {
        super();
    }

    public Weather(Double temperature, Integer humidity, Double windSpeed, Double pressure) {
        super();
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Weather [id=" + id + ", date=" + date + ", temperature=" + temperature + ", humidity=" + humidity
                + ", windSpeed=" + windSpeed + ", pressure=" + pressure + "]";
    }

}
