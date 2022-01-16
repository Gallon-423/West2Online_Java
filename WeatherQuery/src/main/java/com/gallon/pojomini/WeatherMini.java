package com.gallon.pojomini;

import java.sql.Date;
/**
 * @author Gallon
 * @description 简易天气信息类
 */
public class WeatherMini {
    String id;
    Date date;
    String text;
    String min;
    String max;
    String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "查询的地区："+city
                +"\n白天天气状况为："+text
                +"\n最低温："+min+"℃"
                +" 最高温："+max+"℃";
    }
}
