package com.gallon.util;

import com.alibaba.fastjson.JSON;
import com.gallon.pojo.City;
import com.gallon.pojomini.CityMini;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
/**
 * @author Gallon
 * @description 请求获得json工具类
 */
public class HttpUtil {
    static final String KEY ="0dc03807713e44f48f853a0e65948556";
    public static String getCityInfoJSONString(String key, String cityName) throws IOException {
        String cityQueryUrl =
                String.format("https://geoapi.qweather.com/v2/city/lookup?key=%s&location=%s",key,cityName);
        return getJsonString(cityQueryUrl);
    }
    public static String getCityWeatherJSONString(String key, String cityId) throws IOException {
        String cityQueryUrl =
                String.format("https://devapi.qweather.com/v7/weather/3d?key=%s&location=%s",key,cityId);
        return getJsonString(cityQueryUrl);
    }
    private static String getJsonString(String url) throws IOException {
        //1.创建httpclient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //2.创建get对象
        HttpGet get = new HttpGet(url);
        //3.执行get请求，并返回响应结果
        CloseableHttpResponse response = client.execute(get);
        //4.处理结果
        //1)获取结果中的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        //System.out.println("Status Code:"+statusCode);
        //2)获取结果中内容
        HttpEntity entity = response.getEntity();//获得实体内容
        String content = EntityUtils.toString(entity, "utf-8");//通过实体工具类转换实体输出格式
        //System.out.println(content);
        //5.关闭连接
        client.close();
        return content;

    }
    //通过城市名获取id
    public static String getIdByName(String cityName) throws IOException {
        String content=getCityInfoJSONString(KEY,cityName);
        City city= JSON.parseObject(content,City.class);
        return city.getLocation().get(0).getId();
    }

}
