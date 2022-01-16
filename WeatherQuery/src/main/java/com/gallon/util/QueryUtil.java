package com.gallon.util;

import com.alibaba.fastjson.JSON;
import com.gallon.dao.UserMapper;
import com.gallon.myBatisUtils.BasicUtils;
import com.gallon.pojo.Weather;
import com.gallon.pojomini.CityMini;
import com.gallon.pojomini.WeatherMini;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
/**
 * @author Gallon
 * @description 查询工具类
 */
public class QueryUtil {
    static final String KEY="0dc03807713e44f48f853a0e65948556";
    public static CityMini getCityInfo(int choose) throws IOException {
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        String cityName = getNameByNum(choose);
        CityMini cityMini=userMapper.selectCityByName(cityName);
        sqlSession.close();
        return cityMini;
    }
    public static void updateWeather(String name) throws IOException, ParseException {
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //获取查询时日期
        LocalDate localDate=LocalDate.now();
        Date curDate=Date.valueOf(localDate);
        //获取复杂Weather对象
        String content=HttpUtil.getCityWeatherJSONString(KEY,HttpUtil.getIdByName(name));
        Weather weather=JSON.parseObject(content,Weather.class);
        //更新今明后天三天的的天气情况
        List<WeatherMini> weatherMiniList=PojoUtil.weatherToWeatherMini(weather,name);
        for (WeatherMini weatherMini:weatherMiniList
             ) {
            userMapper.addWeather(weatherMini);
        }
        sqlSession.commit();
        sqlSession.close();
    }
    public static WeatherMini getWeather(String city,long offset){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        LocalDate localDate=LocalDate.now().plusDays(offset);
        Date date=Date.valueOf(localDate);
        WeatherMini weatherMini=userMapper.getWeather(date,city);
        sqlSession.close();
        return weatherMini;
    }
    public static String getNameByNum(int x) {
            if(x==1)return "北京";
            else if(x==2) return "上海";
            else if(x==3) return "福州";
            else return "未知城市";
    }




}
