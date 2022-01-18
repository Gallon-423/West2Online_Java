package com.gallon.dao;

import com.gallon.pojo.City;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //列出所有城市
    List<City> getCityList();
    //分页查询实现
    @Select("select * from west2.city_info limit #{start},#{len}")
    List<City> getCityListByPage(@Param("start") int start,@Param("len") int len);
    //根据名字查询城市
    City selectCityByName(@Param("name") String name);
    //根据信息在城市信息表中增加城市
    void addCity(City city);
    //根据信息在城市信息表中删除城市
    void deleteCity(int id);

}
