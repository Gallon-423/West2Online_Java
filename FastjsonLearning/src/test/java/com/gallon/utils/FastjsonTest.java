package com.gallon.utils;

import com.alibaba.fastjson.JSON;
import com.gallon.pojo.City;
import org.junit.Test;

import java.io.IOException;

public class FastjsonTest {
    String key="0dc03807713e44f48f853a0e65948556";
    @Test
    public void test1(){
        try {

            String content=HttpUtil.getCityInfoJSONString(key,"福州");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test2(){
        try {

            String content=HttpUtil.getCityInfoJSONString(key,"福州");
            City city= JSON.parseObject(String.valueOf(content),City.class);
            System.out.println(city.getLocation());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
