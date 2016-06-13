package com.epam.khrapavitski.soapservice.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Currency")
public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Date date;

    private String name;

    private Integer scale;

    private BigDecimal officialRate;

    private String abbreviation;

    public Currency() {
        super();
    }

    public Currency(String name, Integer scale, BigDecimal officialRate, String abbreviation) {
        super();
        this.name = name;
        this.scale = scale;
        this.officialRate = officialRate;
        this.abbreviation = abbreviation;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public BigDecimal getOfficialRate() {
        return officialRate;
    }

    public void setOfficialRate(BigDecimal officialRate) {
        this.officialRate = officialRate;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return "Currency [id=" + id + ", date=" + date + ", name=" + name + ", scale=" + scale + ", officialRate="
                + officialRate + ", abbreviation=" + abbreviation + "]";
    }

}
