package com.example.huarongdao;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
//绘制各地图
public class Mission{
    public static String[] Mission_name = {"新兵: 捉放曹","长官: 文昭关","将军: 路漫漫"};
    public static int[] Mission_finish = new int[3];
    private static void setMap(int width,int height,int location_y,int location_x,int type,int[][] map)
    {
        for(int i=0;i<width;i++)
        {
            for(int j=0;j<height;j++)
            {
                map[location_y+j][location_x+i] = type;
            }
        }
    }
    public static void getFinish( SharedPreferences read)
    {
        for(int i = 0;i<3;i++)
        {
            Mission_finish[i] = read.getInt("Mission" + i,0);
        }
    }
    public static int[][] Mission_1()
    {
        int[][] map = new int[5][4];
        setMap(2,2,0,1,6,map);//设置曹操
        setMap(1,2,0,0,5,map);
        setMap(1,2,0,3,5,map);
        setMap(1,2,2,0,5,map);
        setMap(1,2,2,3,5,map);
        setMap(2,1,2,1,4,map);//设置关羽
        setMap(1,1,4,0,3,map);//设置卒
        setMap(1,1,4,1,3,map);
        setMap(1,1,4,2,3,map);
        setMap(1,1,4,3,3,map);
        return map;
    }
    public static int[][] Mission_2()
    {
        int[][] map = new int[5][4];
        setMap(2,2,0,1,6,map);
        setMap(1,2,1,0,5,map);
        setMap(1,2,1,3,5,map);
        setMap(1,2,3,0,5,map);
        setMap(1,2,3,3,5,map);
        setMap(2,1,2,1,4,map);
        setMap(1,1,0,0,3,map);
        setMap(1,1,0,3,3,map);
        setMap(1,1,3,1,3,map);
        setMap(1,1,3,2,3,map);
        return map;
    }
    public static int[][] Mission_3()
    {
        int[][] map = new int[5][4];
        setMap(2,2,0,2,6,map);
        setMap(1,2,3,3,5,map);
        setMap(2,1,0,0,4,map);
        setMap(2,1,1,0,4,map);
        setMap(2,1,2,0,4,map);
        setMap(2,1,2,2,4,map);
        setMap(1,1,4,0,3,map);
        setMap(1,1,3,0,3,map);
        setMap(1,1,3,2,3,map);
        setMap(1,1,4,2,3,map);
        return map;
    }
    public static int[][] get_Mission(int choice)
    {
        switch (choice)
        {
            case 0:
                return Mission_1();
            case 1:
                return Mission_2();
            case 2:
                return Mission_3();
        }
        return new int[5][4];
    }
}
