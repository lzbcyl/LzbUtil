package com.lzb.lzbutils.utils;

import android.util.Log;

public class LogUtils {


    public static void loge(String TAG, Object obj) {
        Log.e(TAG, "log: " + obj);
    }

    public static void logi(String TAG, Object obj) {
        Log.i(TAG, "log: " + obj);
    }
}
