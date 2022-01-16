import com.alibaba.fastjson.JSON;
import com.gallon.dao.UserMapper;
import com.gallon.myBatisUtils.BasicUtils;
import com.gallon.pojo.City;
import com.gallon.pojomini.CityMini;
import com.gallon.util.HttpUtil;
import com.gallon.util.PojoUtil;
import com.gallon.util.QueryUtil;
import com.gallon.view.CommandUi;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    static final String KEY="0dc03807713e44f48f853a0e65948556";
    public static void main(String[] args) throws IOException, ParseException, InterruptedException {
        init();
        CommandUi.go();
    }
    /**
     * @author Gallon
     * @description 对数据库信息表信息进行初始化
     */
    private static void init() throws IOException {
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        for (int i = 1; i <= 3; i++) {
            String content= HttpUtil.getCityInfoJSONString(KEY,QueryUtil.getNameByNum(i));
            City city= JSON.parseObject(content, City.class);
            CityMini cityMini= PojoUtil.cityToCityMini(city);
            userMapper.addCity(cityMini);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
