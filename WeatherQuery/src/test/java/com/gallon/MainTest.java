package com.gallon;

import com.gallon.dao.UserMapper;
import com.gallon.myBatisUtils.BasicUtils;
import com.gallon.util.QueryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class MainTest {
    @Test
    public void test() throws IOException {
        SqlSession sqlSession= BasicUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.addCity(QueryUtil.getCityInfo(1));
        userMapper.addCity(QueryUtil.getCityInfo(2));
        userMapper.addCity(QueryUtil.getCityInfo(3));
        sqlSession.commit();
        sqlSession.close();
    }
}
