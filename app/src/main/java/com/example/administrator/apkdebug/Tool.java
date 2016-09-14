package com.example.administrator.apkdebug;

/**
 * Created by Administrator on 2016/4/23.
 */
public class Tool
{
    public static String convert_smali(String original)
    {
        String result;
        result=convert(original);
        return result;
    }
    public static String convert(String original)
    {
        return original.replace("6.00","0.01");
    }
}
