package com.gallon.dao;

import com.gallon.pojo.City;
import com.gallon.utils.BasicUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DaoTest {
    @Test
    public void getCityListTest(){
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
    public void getCityByNameTest(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        City city=userMapper.selectCityByName("福州");
        System.out.println(city.getId());
        sqlSession.close();
    }
    @Test
    public void addCityTest(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        City city=new City();
        city.setName("德克士");
        city.setLat("123");
        city.setLon("321");
        city.setId(1234567);
        userMapper.addCity(city);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteCityTest(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.deleteCity(1234567);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void getCityListByPageTest(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        int start=1;
        int len=2;
        List<City> cityListByPage = userMapper.getCityListByPage(start, len);
        for (City city:cityListByPage
             ) {
            System.out.println(city);
        }
        sqlSession.commit();
        sqlSession.close();

    }
}

