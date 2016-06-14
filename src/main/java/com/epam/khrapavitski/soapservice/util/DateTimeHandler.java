package com.epam.khrapavitski.soapservice.util;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class DateTimeHandler implements TypeHandler<XMLGregorianCalendar> {

    @Override
    public void setParameter(PreparedStatement ps, int i, XMLGregorianCalendar parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setTimestamp(i, new Timestamp(Util.toDate(parameter).getTime()));
    }

    @Override
    public XMLGregorianCalendar getResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public XMLGregorianCalendar getResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public XMLGregorianCalendar getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }

}
