package com.gallon.util;

import com.gallon.pojo.City;
import com.gallon.pojo.DailyItem;
import com.gallon.pojo.LocationItem;
import com.gallon.pojo.Weather;
import com.gallon.pojomini.CityMini;
import com.gallon.pojomini.WeatherMini;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gallon
 * @description pojo工具类
 */
public class PojoUtil {
    public static CityMini cityToCityMini(City city){
        /**
         * @Name cityToCityMini
         * @Params [city]
         * @PramTypes [com.gallon.pojo.City]
         * @Return com.gallon.pojomini.CityMini
        */
        CityMini cityMini=new CityMini();
        LocationItem info =city.getLocation().get(0);
        cityMini.setName(info.getName());
        cityMini.setId(info.getId());
        cityMini.setLat(info.getLat());
        cityMini.setLon(info.getLon());
        return cityMini;
        
    }
    public static List<WeatherMini> weatherToWeatherMini(Weather weather,String city) throws ParseException, IOException {
        List<DailyItem> dailyItemList=weather.getDaily();
        List<WeatherMini> dailyInfoMiniList=new ArrayList<>();
        for (DailyItem item:dailyItemList
             ) {
            WeatherMini newWeatherMini =new WeatherMini();
            newWeatherMini.setMax(item.getTempMax());
            newWeatherMini.setText(item.getTextDay());
            newWeatherMini.setDate(Date.valueOf(item.getFxDate()));
            newWeatherMini.setMin(item.getTempMin());
            newWeatherMini.setCity(city);
            newWeatherMini.setId(HttpUtil.getIdByName(city));
            dailyInfoMiniList.add(newWeatherMini);
        }
        return dailyInfoMiniList;

    }

}
