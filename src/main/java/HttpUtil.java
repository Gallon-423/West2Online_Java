import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

public class HttpUtil {
    public static StringBuilder getCityJSON(String key, String cityName) throws IOException {
        String cityQueryUrl = "https://geoapi.qweather.com/v2/city/lookup?key="
                + key
                + "&location="
                + cityName;
        //1.创建httpclient对象
        CloseableHttpClient client = HttpClients.createDefault();
        //2.创建get对象
        HttpGet get = new HttpGet(cityQueryUrl);
        //3.执行get请求，并返回响应结果
        CloseableHttpResponse response = client.execute(get);
        //4.处理结果
        //1.获取结果中的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        //2.获取结果中内容
        HttpEntity entity = response.getEntity();//获得实体内容
        String content = EntityUtils.toString(entity, "utf-8");//通过实体工具类转换实体输出格式
        System.out.println(content);
        //5.关闭连接
        client.close();
        return new StringBuilder(content);
    }
}
