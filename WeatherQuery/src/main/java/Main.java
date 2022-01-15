import util.HttpUtil;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入你要查询的城市");
        Scanner sc=new Scanner(System.in);
        String cityName=sc.next();
        HttpUtil.getCityInfoJSONString("0dc03807713e44f48f853a0e65948556",cityName);
        HttpUtil.getCityWeatherJSONString("0dc03807713e44f48f853a0e65948556","101230101");
    }
}
