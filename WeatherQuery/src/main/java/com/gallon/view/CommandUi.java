package com.gallon.view;

import com.gallon.pojomini.WeatherMini;
import com.gallon.util.QueryUtil;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class CommandUi {
    public static void go() throws IOException, ParseException, InterruptedException {
        queryAction();
        Scanner sc=new Scanner(System.in);
        int step=sc.nextInt();
        boolean flag=true;
        int offset;
        int cityNum;
        //使用Thread使结果显示更好地被看见
        while(true){
            switch (step){
                case 1:
                    //查询城市信息
                    chooseCity();
                    cityNum = sc.nextInt();
                    System.out.println(QueryUtil.getCityInfo(cityNum));
                    Thread.sleep(1000);
                    break;
                case 2:
                    //查询天气
                    chooseCity();
                    cityNum=sc.nextInt();
                    chooseDate();
                    offset = sc.nextInt();
                    WeatherMini weatherMini=QueryUtil.getWeather(QueryUtil.getNameByNum(cityNum),offset);
                    System.out.println(weatherMini==null?"还未更新改日信息，请进行更新操作后再次尝试!":weatherMini);
                    Thread.sleep(1000);
                    break;
                case 3:
                    //更新天气
                    chooseCity();
                    cityNum=sc.nextInt();
                    QueryUtil.updateWeather(QueryUtil.getNameByNum(cityNum));
                    System.out.println("更新成功~");
                    break;

                case 4:
                    //退出查询
                    System.out.println("bye~");
                    return;
                default:
                    System.out.println("输入的数字超出范围！");
                    break;
            }
            //为了让结果不被滚动条太快被向上顶
            Thread.sleep(2000);
            queryAction();
            step=sc.nextInt();
        }


    }
    private static void queryAction(){
        System.out.println("根据你想要做的事选择步骤，输入数字（不需要键入中括号）：");
        System.out.println("[1]查询城市信息");
        System.out.println("[2]查询城市天气（首次查询前需进行天气更新）");
        System.out.println("[3]更新天气");
        System.out.println("[4]退出查询");
    }
    private static void chooseCity(){
        System.out.println("请选择你要进行操作的城市：");
        System.out.println("[1] 北京");
        System.out.println("[2] 上海");
        System.out.println("[3] 福州");
    }
    private static void chooseDate(){
        System.out.println("请选择你需要查询的日期：");
        //之所以此处从0开始是直接对应距离查询时日期的偏移量
        System.out.println("[0] 今天");
        System.out.println("[1] 明天");
        System.out.println("[2] 后天");
    }

}
