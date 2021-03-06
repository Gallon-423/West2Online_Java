package com.gallon.myBatisUtils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Gallon
 * @description Basic Utilities in Mybatis
 */
public class BasicUtils {
    private static SqlSessionFactory sqlSessionFactory;
    //使用mybatis第一步 创建SqlSessionFactory对象
     static {
         try{
             String resource = "mybatis-config.xml";
             InputStream inputStream = Resources.getResourceAsStream(resource);
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
         }catch (IOException e){
             e.printStackTrace();
         }

     }

     public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
     }

}
