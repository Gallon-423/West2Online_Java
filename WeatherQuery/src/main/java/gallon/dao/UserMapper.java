package gallon.dao;

import com.gallon.pojo.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<City> getCityList();
    //根据名字查询城市
    City selectCityByName(@Param("name") String name);
    //根据信息在城市信息表中增加城市
    void addCity(City city);
    //根据信息在城市信息表中删除城市
    void deleteCity(int id);

}
