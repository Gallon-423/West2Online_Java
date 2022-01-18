package com.gallon;
import com.alibaba.fastjson.JSON;
import com.gallon.dao.UserMapper;
import com.gallon.myBatisUtils.BasicUtils;
import com.gallon.pojo.City;
import com.gallon.pojomini.CityMini;
import com.gallon.pojomini.WeatherMini;
import com.gallon.util.HttpUtil;
import com.gallon.util.PojoUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.io.IOException;
import java.util.List;
public class DaoTest {
    String key="0dc03807713e44f48f853a0e65948556";
    /**
     * @author Gallon
     * @description 测试查询
     */
    @Test
    public void selectTest(){
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
    public void cityToCityMiniTest(){
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
    public void addCityTest() throws IOException {
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
    public void deleteCityTest() throws IOException {
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
    public void addWeatherTest() throws IOException {
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
    public void getWeatherTest() throws IOException {
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
     * @author Gallon
     * @description 测试分页查询功能
     */
    @Test
    public void selectByPageTest(){
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //对于分页查询功能实现的检验，下标为1的行开始，页长为2。城市信息存放信息顺序为北京、上海、福州
        //查询结果 上海、福州 符合预期
        List<CityMini> cityList= userMapper.getCityListByPage(1,2);
        for (CityMini cityMini:cityList
        ) {
            System.out.println(cityMini);
        }
        sqlSession.close();
    }


}
