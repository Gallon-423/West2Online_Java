package util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
/**
 * @author Gallon
 * @className util.HttpUtil
 * @package
 * @description
 * @time 2022-01-08,周六 20:49
 */
public class HttpUtil {
    public static StringBuilder getCityInfoJSONString(String key, String cityName) throws IOException {
        String cityQueryUrl =
                String.format("https://geoapi.qweather.com/v2/city/lookup?key=%s&location=%s",key,cityName);
        //1.创建httpclient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //2.创建get对象
        HttpGet get = new HttpGet(cityQueryUrl);
        //3.执行get请求，并返回响应结果
        CloseableHttpResponse response = client.execute(get);
        //4.处理结果
        //1)获取结果中的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("Status Code:"+statusCode);
        //2)获取结果中内容
        HttpEntity entity = response.getEntity();//获得实体内容
        String content = EntityUtils.toString(entity, "utf-8");//通过实体工具类转换实体输出格式
        System.out.println(content);
        //5.关闭连接
        client.close();
        return new StringBuilder(content);

    }
    public static StringBuilder getCityWeatherJSONString(String key, String cityId)
            throws IOException {
        String cityQueryUrl =
                String.format("https://devapi.qweather.com/v7/weather/3d?key=%s&location=%s",key,cityId);
        //1.创建httpclient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //2.创建get对象
        HttpGet get = new HttpGet(cityQueryUrl);
        //3.执行get请求，并返回响应结果
        CloseableHttpResponse response = client.execute(get);
        //4.处理结果
        //1)获取结果中的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("Status Code:"+statusCode);
        //2)获取结果中内容
        HttpEntity entity = response.getEntity();//获得实体内容
        String content = EntityUtils.toString(entity, "utf-8");//通过实体工具类转换实体输出格式
        System.out.println(content);
        //5.关闭连接
        client.close();
        return new StringBuilder(content);

    }


}
