package com.gallon.pojomini;
/**
 * @author Gallon
 * @description 简易城市信息类
 */
public class CityMini {
    private String name;
    private String id;
    private String lon;
    private String lat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "城市名："+name+"\n经度："+lon+" 纬度："+lat+"\n对应ID是："+id;
    }
}
