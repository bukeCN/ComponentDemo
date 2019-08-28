package cn.test.comm.utils;

import android.os.SystemClock;

/**
 * 时间/日期工具类
 */
public class TimeUtils {
    public static long getTimeMillis(){
        return SystemClock.currentThreadTimeMillis();
    }
}
