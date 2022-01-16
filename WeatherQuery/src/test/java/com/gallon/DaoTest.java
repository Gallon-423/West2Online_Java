package com.gallon;

import com.alibaba.fastjson.JSON;
import com.gallon.dao.UserMapper;
import com.gallon.myBatisUtils.BasicUtils;
import com.gallon.pojo.City;
import com.gallon.pojo.Weather;
import com.gallon.pojomini.CityMini;
import com.gallon.pojomini.WeatherMini;
import com.gallon.util.HttpUtil;
import com.gallon.util.PojoUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class DaoTest {
    String key="0dc03807713e44f48f853a0e65948556";
    /**
     * @author Gallon
     * @description 测试查询
     */
    @Test
    public void test1(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<CityMini> cityList= userMapper.getCityList();
        for (CityMini city:cityList
        ) {
            System.out.println(city);

        }
        sqlSession.close();
    }
    /**
     * @author Gallon
     * @description 测试构建Citymini对象
     */
    @Test
    public void test2(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<CityMini> cityList= userMapper.getCityList();
        CityMini cityMini=cityList.get(0);
        System.out.println(cityMini);
        sqlSession.close();
    }
    /**
     * @author Gallon
     * @description 构建对象增加进城市信息表
     */
    @Test
    public void test3() throws IOException {
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        City shangHai=
                JSON.parseObject
                        (HttpUtil.getCityInfoJSONString(key,"上海"),City.class);
        CityMini shangHaiMini= PojoUtil.cityToCityMini(shangHai);
        userMapper.addCity(shangHaiMini);
        sqlSession.commit();
        sqlSession.close();
    }
    /**
     * @author Gallon
     * @description 根据城市名将信息从城市信息表删除
     */
    @Test
    public void test4() throws IOException {
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.deleteCity("上海");
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * @author Gallon
     * @description 在特定城市的日信息表中加入信息
     */
    @Test
    public void test5() throws IOException {
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        sqlSession.commit();
        sqlSession.close();
    }
    /**
     * @author Gallon
     * @description 在特定城市的日信息表中获取信息
     */
    @Test
    public void test6() throws IOException {
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<WeatherMini> infoList= userMapper.getInfoList();
        for (WeatherMini dailyInfoMini:infoList
        ) {
            System.out.println(dailyInfoMini);

        }
        sqlSession.close();
    }
    /**
     * DEPRECATED
     * @author Gallon
     * @description 测试方法弃用
     */
//    @Test
//    public void test7() throws IOException, ParseException {
//        SqlSession sqlSession= BasicUtils.getSqlSession();
//        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
//        City shangHai=
//                JSON.parseObject
//                        (HttpUtil.getCityInfoJSONString(key,"上海"),City.class);
//        CityMini shangHaiMini= PojoUtil.cityToCityMini(shangHai);
//        String content=HttpUtil.getCityWeatherJSONString(key,shangHaiMini.getId());
//        Weather weather=JSON.parseObject(content,Weather.class);
//        List<WeatherMini> weatherMiniList=PojoUtil.weatherToWeatherMini(weather);
//        //System.out.println(dailyInfoMiniList.get(0));
//        userMapper.addDailyInfoInShanghai(dailyInfoMiniList.get(0));
//        sqlSession.commit();
//        sqlSession.close();
//    }


}
