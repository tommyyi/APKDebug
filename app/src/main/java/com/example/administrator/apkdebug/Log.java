package com.example.administrator.apkdebug;

/**
 * Created by Administrator on 2016/7/6.
 */
public class Log
{
    public static void print(String tag, String info)
    {

        android.util.Log.e(tag,info);
    }

    public static void print(int tag,String info)
    {
        String local=tag+"";
        android.util.Log.e(local,info);
    }

    public static void call_print(int code,String info)
    {
        print(code,info);
    }
}
