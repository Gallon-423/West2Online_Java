package com.gallon.dao;
import com.gallon.pojomini.CityMini;
import com.gallon.pojomini.WeatherMini;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Date;
import java.util.List;
/**
 * @author Gallon
 * @description
 */
public interface UserMapper {
    //获取城市信息表达的所有城市信息
    List<CityMini> getCityList();
    //分页查询实现
    @Select("select * from west2.city_info limit #{start},#{len}")
    List<CityMini> getCityListByPage(@Param("start") int start,@Param("len") int len);
    //根据名字在城市信息表查询城市
    CityMini selectCityByName(@Param("name") String name);
    //根据信息在城市信息表中增加城市
    void addCity(CityMini city);
    //根据信息在城市信息表中删除城市
    void deleteCity(String name);

    //获取全部天气信息
    List<WeatherMini> getInfoList();
    //添加天气信息
    void addWeather(WeatherMini weather);
    //查询天气
    WeatherMini getWeather(@Param("date") Date date,@Param("city") String city);
}
