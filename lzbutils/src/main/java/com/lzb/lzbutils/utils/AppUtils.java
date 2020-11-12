package com.lzb.lzbutils.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/**
 * 安卓系统工具类
 */
public class AppUtils {

    //判断当前应用是否是debug状态
    public static boolean isApkInDebug(Context context) {
        try {
            ApplicationInfo info = context.getApplicationInfo();
            return (info.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        } catch (Exception e) {
            return false;
        }
    }
}

