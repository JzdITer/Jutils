package com.jzd.android.jutils.utils;

import android.util.Log;

/**
 * Log工具类
 *
 * @author jzd
 * @date 2018/8/5 22:32
 * @email jzd_dev1@163.com
 * @since v1.0
 */
public class JLog {
    private static String  TAG     = "JLog";
    public static  boolean isDebug = true;

    /**
     * 设置debug模式
     *
     * @param debug true:会输出日志 false:不会输入日志
     */
    public static void setDebug(boolean debug) {
        isDebug = debug;
    }

    /**
     * 输出ERROR日志
     */
    public static void e(String msg) {
        if(isDebug) {
            Log.e(TAG, msg);
        }
    }

    /**
     * 输出INFO日志
     */
    public static void i(String msg) {
        if(isDebug) {
            Log.i(TAG, msg);
        }
    }

    /**
     * 输出DEBUG日志
     */
    public static void d(String msg) {
        if(isDebug) {
            Log.d(TAG, msg);
        }
    }

    /**
     * 输出VERBOSE日志
     */
    public static void v(String msg) {
        if(isDebug) {
            Log.v(TAG, msg);
        }
    }

    /**
     * 输出WARN日志
     */
    public static void w(String msg) {
        if(isDebug) {
            Log.w(TAG, msg);
        }
    }

}
