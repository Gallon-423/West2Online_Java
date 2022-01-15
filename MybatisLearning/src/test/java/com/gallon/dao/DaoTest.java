package com.gallon.dao;

import com.gallon.pojo.City;
import com.gallon.utils.BasicUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DaoTest {
    @Test
    public void test1(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<City> cityList= userMapper.getCityList();
        for (City city:cityList
             ) {
            System.out.println(city);

        }
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        City city=userMapper.selectCityByName("福州");
        System.out.println(city.getId());
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        City city=new City();
        city.setName("多拉贡");
        city.setLat("123");
        city.setLon("321");
        city.setId(1234567);
        userMapper.addCity(city);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.deleteCity(1234567);
        sqlSession.commit();
        sqlSession.close();
    }
}

