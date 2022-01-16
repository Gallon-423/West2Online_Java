package com.gallon;

import com.alibaba.fastjson.JSON;
import com.gallon.pojo.City;

import com.gallon.pojo.DailyItem;
import com.gallon.pojo.LocationItem;
import com.gallon.pojo.Weather;
import com.gallon.util.HttpUtil;
import org.junit.Test;

import java.io.IOException;

public class GsonTest {
    String key="0dc03807713e44f48f853a0e65948556";

    @Test
    public void test1(){
        try {
            String content= HttpUtil.getCityInfoJSONString(key,"上海");
            City city=JSON.parseObject(content,City.class);
            System.out.println(city);
            for (LocationItem item:city.getLocation()
                 ) {
                System.out.println("城市名：" + item.getName()+" ID:"+item.getId());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test2() throws IOException {
        String content= HttpUtil.getCityWeatherJSONString(key,"101020100");
        Weather weather=JSON.parseObject(content,Weather.class);
        for (DailyItem item:weather.getDaily()
             ) {
            System.out.println("日期是："+item.getFxDate() +" 最低温是："+item.getTempMin()
                    + " 最高温是："+item.getTempMax() +" 白天天气情况："+item.getTextDay());

        }
        System.out.println(weather);
    }
}
